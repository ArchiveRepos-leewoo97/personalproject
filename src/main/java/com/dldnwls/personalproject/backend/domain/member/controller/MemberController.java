package com.dldnwls.personalproject.backend.domain.member.controller;

import com.dldnwls.personalproject.backend.domain.member.dto.request.SignUpReqDto;
import com.dldnwls.personalproject.backend.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member/signup")
    public ResponseEntity<?> signUp(@RequestBody SignUpReqDto signUpReqDto){
        try {
            memberService.signUp(signUpReqDto);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("회원가입이 완료되었습니다.");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body("알 수 없는 오류로, 회원가입에 실패하였습니다.");
        }
    }
}
