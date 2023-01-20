package com.greenart.firstproject.vo;

import java.time.LocalDate;

import com.greenart.firstproject.entity.MileagePointEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MileageInfoVO {
    private String email;
    private String nickname;
    private Integer mpPrice;
    private LocalDate mpExpirationDate;
    
    public static MileageInfoVO fromEntity(MileagePointEntity entity) {
        return MileageInfoVO.builder()
        .email(entity.getUser().getEmail())
        .nickname(entity.getUser().getNickname())
        .mpPrice(entity.getMpPrice())
        .mpExpirationDate(entity.getMpExpirationDate())
        .build();
    }
}
