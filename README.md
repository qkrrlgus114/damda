# <img src="exec/img/popup.png" width="50">서로의 추억을 담고 공유하는 타임캡슐 서비스<img src="exec/img/popup.png" width="50">
<img src="exec/img/EMAIL_CONFIRM.png" width="800" height="250">

# 1️⃣ **프로젝트 개요**

### 💙**개발 기간**💙
| 개발기간 | 2023.07.10 ~ 2023.08.18 (6주) |
| --- | --- |
<br>

### 💚자바칩 프라푸치노💚

|**[신창학](https://github.com/leon4652)**|**[정현모](https://github.com/wjdgusaho)**|**[박기현](https://github.com/qkrrlgus114)**|**[이지영](https://github.com/xkagja2006)**|**[권소정](https://github.com/nachocatee)**|**[차영범](https://github.com/ChaRob)** |
| :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: |
| <img src="https://avatars.githubusercontent.com/u/93763809?v=4" width="800"> | <img src="https://avatars.githubusercontent.com/u/56811267?v=4" width="800"> | <img src="https://avatars.githubusercontent.com/u/121294224?v=4" width="800"> | <img src="https://avatars.githubusercontent.com/u/28944196?v=4" width="800"> | <img src="https://avatars.githubusercontent.com/u/122436557?v=4" width="800"> | <img src="https://avatars.githubusercontent.com/u/122436538?v=4" width="800"> |
|Backend|Backend|Backend|Frontend|Frontend|Frontend|

### 🧡**역할 분담🧡
**Frontend**

- 권소정 : 
- 이지영 : 
- 차영범 : 


**Backend**

- 신창학 : 팀장, 인프라 담당, SSE를 이용한 실시간 알림, 날씨와 위치 관련 API, 발표, DB설계 및 구축
- 정현모 : DB설계 및 구축, 타임캡슐 로직, OAUTH 소셜 로그인, 상점 및 아이템 관리
- 박기현 : DB설계 및 구축, 회원 관리, 친구 관리, JWT 토큰, 스프링 시큐리티

### 💛**기획 배경**💛
```
핵심 : 핫하고 캐주얼한 컨텐츠와 현대인에게 필요한 감성을 결합하여 제공

- 대충 현대인에게 감성이 필요하다는 것(문제상황)
- 캐주얼한 컨텐츠가 핫하다는걸 강조

롤링페이퍼, 심리테스트 등
```

### 💜**목표**💜
```
담다 타임캡슐 서비스를 통해 많은 사람들이 추억을 공유하고 즐거움을 느끼는 것이 목표입니다.
```

<hr>

# 2️⃣ **서비스 소개**
> **회원가입**
<img src="exec/gif/회원가입.gif">
<br>

> **로그인**
<img src="exec/gif/로그인.gif">
<br>

> **친구 요청 알람**
<img src="exec/gif/친구요청받음.gif">
<br>

> **테마, 스티커 구매**
<img src="exec/gif/테마스티커구매.gif">
<br>

> **클래식 타임캡슐 만들기**
<img src="exec/gif/클래식만들기.gif">
<br>

> **기록 타임캡슐 만들기**
<img src="exec/gif/기록만들기.gif">
<br>

> **목표 타임캡슐 만들기**
<img src="exec/gif/목표만들기.gif">
<br>

> **타임캡슐 초대하기**
<img src="exec/gif/타임캡슐초대.gif">
<br>

> **타임캡슐 초대받기 알람**
<img src="exec/gif/타임캡슐초대참석.gif">
<br>

> **카드 작성**
<img src="exec/gif/카드작성.gif">
<br>

> **타임캡슐 열기**
<img src="exec/gif/타임캡슐열기.gif">
<br>

> **테마 변경**
<img src="exec/gif/테마변경.gif">
<br>

<hr>

# 3️⃣ **개발 환경**

# 개발 환경

## ⚙ Management Tool
- 형상 관리 : Gitlab
- 이슈 관리 : Jira
- 커뮤니케이션 : Mattermost, Notion, Discord
- 디자인 : Figma, Canva

<br>

## 💻 IDE
- Visual Studio Code
- Intellij CE 2023.1.3

<br>

## 📱 Frontend
- Node.js `18.16.1` LTS
- React `18.2.0`
  - React-canvas-confetti `1.4.0`
  - React-cookie `4.1.1`
  - react-datepicker `4.16.0`
  - react-dom `18.2.0`
  - react-hot-toast `2.4.1`
  - react-minimal-pie-chart `8.4.0`
  - react-modal `3.16.1`
  - react-redux `8.1.1`
  - react-router-dom `6.14.1`
  - react-scripts `5.0.1`
  - react-slick `0.29.0`
  - react-toastify `9.1.3`
  - redux-persist `6.0.0`
  - redux-thunk `2.4.2`
  - slick-carousel `1.8.1`
  - styled-components `6.0.4`
  - Redux RTK `1.9.1`
- TypeScript `4.9.5`
- axios `1.4.0`
- email-validator `2.0.4`
- event-source-polyfill `1.0.31`
- html2canvas `1.4.1`
- TailwindCss `3.3.3`
  - TailwindCss-styled-component `2.2.0`

<br>

## 📁 Backend

- Springboot `2.7.13`
- Lombok
- Spring Data JPA 
- Spring Data Redis(lettuce)
- Spring Web
- Spring cloud(spring cloud gateway, spring cloud eureka, spring cloud config server) `3.1.3`
- QueryDSL
- webflux, netty
- Springdoc-openapi-starter-webmvc-ui `2.0.0`
- Oauth2
- WebSocket
- Redis
- MySql
- Swagger `3.0.0`
- SSL
- CertBot(CA Certificates)`

## 💾 Database

- MySQL

## 🌁 Infra

- Jenkins 2.401.3
- docker-compose
- SSL
- CertBot

## 🎞 Storage

- AWS S3

<hr>


# 4️⃣**주요 기술**

<hr>

# 5️⃣**설계 문서**

## 🎨 와이어프레임
[Figma](https://www.figma.com/file/KfTJUuphqmJRK5it8h6aMr/Untitled?type=design&node-id=0-1&mode=design&t=z88hDAL0fIBs31uK-0)
<br>
<img src="exec/img/와이어프레임.PNG">

<br><br>

## 📃 요구사항 정의서
[Notion](https://steady-volcano-b48.notion.site/0870f776b4fc47eeb4bde9526394b5ad?pvs=4)
<img src="exec/img/요구사항 정의서.PNG">


<br><br>

## 📝 인터페이스 명세서
[Notion](https://steady-volcano-b48.notion.site/056c428abbeb4d1f9682fc0d94c65ea4?pvs=4)
<img src="exec/img/인터페이스 명세서.PNG">


<br><br>

## 📏 ERD
[erd](https://www.erdcloud.com/d/bKhfPnxa3Cvx89cSN)
<img src="exec/img/erd.png">


<br><br>

## 📐 시스템 아키텍처
<img src="exec/img/시스템 아키텍쳐.PNG">


<br><br>
