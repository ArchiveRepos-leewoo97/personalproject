package com.dldnwls.personalproject.backend.domain.member.service;

import com.dldnwls.personalproject.backend.domain.member.dto.request.SignUpReqDto;

public interface MemberService { //회원 서비스 인터페이스

    void signUp(SignUpReqDto signUpReqDto); //회원 가입

}
