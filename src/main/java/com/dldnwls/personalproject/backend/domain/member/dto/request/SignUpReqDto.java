package com.dldnwls.personalproject.backend.domain.member.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpReqDto {

    private String email; //이메일

    private String password; //패스워드

    private String name; //이름

    private String nickName; //닉네임

    private int age; //나이

    private int sex; //성별

}
