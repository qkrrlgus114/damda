package com.b210.damda.domain.entity;

import com.b210.damda.domain.dto.SaveCapsuleCriteriaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter  @Getter
@Builder
@AllArgsConstructor
public class TimecapsuleCriteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long criteriaId;

    private String type;

    private String weatherStatus;

    private Date cardInputStart;

    private Date cardInputEnd;

    private int nx;

    private int ny;

    private String location;

    public TimecapsuleCriteria() {

    }


    public SaveCapsuleCriteriaDTO toSaveCapsuleCriteriaDTO(){
        return SaveCapsuleCriteriaDTO.builder()
                .type(this.type)
                .weatherStatus(this.weatherStatus)
                .location(this.location)
                .build();
    }
}
