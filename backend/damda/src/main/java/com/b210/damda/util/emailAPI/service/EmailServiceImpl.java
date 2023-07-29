package com.b210.damda.util.emailAPI.service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Random;

import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.b210.damda.domain.entity.EmailSendLog;
import com.b210.damda.domain.entity.SignupEmailLog;
import com.b210.damda.domain.entity.User;
import com.b210.damda.util.emailAPI.repository.EmailSendLogRepository;
import com.b210.damda.util.emailAPI.repository.SignupEmailLogRepository;
import com.b210.damda.util.exception.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmailServiceImpl implements EmailService {

    JavaMailSender emailSender;
    EmailSendLog emailSendLog;
    EmailSendLogRepository emailSendLogRepository;
    SignupEmailLogRepository signupEmailLogRepository;
    SignupEmailLog signupEmailLog;

    @Autowired
    public EmailServiceImpl(JavaMailSender emailSender, EmailSendLogRepository emailSendLogRepository, SignupEmailLogRepository signupEmailLogRepository) {
        this.emailSender = emailSender;
        this.emailSendLogRepository = emailSendLogRepository;
        this.signupEmailLogRepository = signupEmailLogRepository;
    }

    private MimeMessage createMessageChange(String to, String authCode)throws Exception{
        System.out.println("보내는 대상 : " + to);
        System.out.println("인증 번호 : " + authCode);
        MimeMessage  message = emailSender.createMimeMessage();

        message.addRecipients(RecipientType.TO, to);//보내는 대상
        message.setSubject("(담다) 비밀번호 재설정 이메일입니다.");//제목

        String msgg="";
        msgg+= "<div style='margin:20px;'>";
        msgg+= "<h1> 안녕하세요 담다입니다. </h1>";
        msgg+= "<br>";
        msgg+= "<p>아래 코드를 복사해 입력해주세요<p>";
        msgg+= "<br>";
        msgg+= "<p>감사합니다.<p>";
        msgg+= "<br>";
        msgg+= "<div align='center' style='border:1px solid black; font-family:verdana';>";
        msgg+= "<h3 style='color:blue;'>비밀번호 찾기 인증코드입니다. 해당 코드는 10분만 유효합니다.</h3>";
        msgg+= "<div style='font-size:130%'>";
        msgg+= "CODE : <strong>";
        msgg+= authCode + "</strong><div><br/> ";
        msgg+= "</div>";
        message.setText(msgg, "utf-8", "html");//내용
        message.setFrom(new InternetAddress("damdaCop@gmail.com","담다"));//보내는 사람

        return message;
    }

    private MimeMessage createMessageRegist(String to, String authCode)throws Exception{
        System.out.println("보내는 대상 : " + to);
        System.out.println("인증 번호 : " + authCode);
        MimeMessage  message = emailSender.createMimeMessage();

        message.addRecipients(RecipientType.TO, to);//보내는 대상
        message.setSubject("(담다) 회원가입 인증번호 이메일입니다.");//제목

        String msgg="";
        msgg+= "<div style='margin:20px;'>";
        msgg+= "<h1> 안녕하세요 담다입니다. </h1>";
        msgg+= "<br>";
        msgg+= "<p>아래 코드를 복사해 입력해주세요<p>";
        msgg+= "<br>";
        msgg+= "<p>감사합니다.<p>";
        msgg+= "<br>";
        msgg+= "<div align='center' style='border:1px solid black; font-family:verdana';>";
        msgg+= "<h3 style='color:blue;'>회원가입 인증코드입니다. 해당 코드는 10분만 유효합니다.</h3>";
        msgg+= "<div style='font-size:130%'>";
        msgg+= "CODE : <strong>";
        msgg+= authCode + "</strong><div><br/> ";
        msgg+= "</div>";
        message.setText(msgg, "utf-8", "html");//내용
        message.setFrom(new InternetAddress("damdaCop@gmail.com","담다"));//보내는 사람

        return message;
    }

    public static String createKey() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        int length = 16;
        SecureRandom rnd = new SecureRandom();

        StringBuilder key = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            key.append(characters.charAt(rnd.nextInt(characters.length())));
        }

        return key.toString();
    }

    public String sendSimpleMessageChange(String to)throws Exception {
        String authCode =  createKey(); // 인증코드 생성
        MimeMessage message = createMessageChange(to, authCode); // 메시지 생성
        try{ // 예외처리
            emailSender.send(message);
        }catch(MailException es){
            es.printStackTrace();
            throw new IllegalArgumentException();
        }
        return authCode;
    }

    public String sendSimpleMessageRegist(String to)throws Exception {
        String authCode =  createKey(); // 인증코드 생성
        MimeMessage message = createMessageRegist(to, authCode); // 메시지 생성
        try{ // 예외처리
            emailSender.send(message);
        }catch(MailException es){
            es.printStackTrace();
            throw new IllegalArgumentException();
        }
        return authCode;
    }


    @Override
    @Transactional
    public Long changeTempKey(String key, String email, User user) {
        EmailSendLog build = emailSendLog.builder()
                .email(email)
                .verificationCode(key)
                .user(user)
                .createTime(LocalDateTime.now())
                .expiryTime(LocalDateTime.now().plusMinutes(10))
                .build();

        EmailSendLog save = emailSendLogRepository.save(build);

        return save.getEmailSendLogNo();
    }

    @Override
    @Transactional
    public Long registTempKey(String key, String email) {
        SignupEmailLog build = SignupEmailLog.builder()
                .email(email)
                .verificationCode(key)
                .createTime(LocalDateTime.now())
                .expiryTime(LocalDateTime.now().plusSeconds(20))
                .build();

        SignupEmailLog save = signupEmailLogRepository.save(build);
        return save.getSignupEmailLogNo();
    }


}