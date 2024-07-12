package com.dldnwls.personalproject.backend.domain.member.service.Impl;

import com.dldnwls.personalproject.backend.domain.member.dto.request.SignUpReqDto;
import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import com.dldnwls.personalproject.backend.domain.member.repo.MemberRepository;
import com.dldnwls.personalproject.backend.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService { //회원 서비스 구현

    private final MemberRepository memberRepository;

    @Override
    public void signUp(SignUpReqDto signUpReqDto) { //회원 가입

        Member member = Member.builder()
                .email(signUpReqDto.getEmail())
                .password(signUpReqDto.getPassword())
                .name(signUpReqDto.getName())
                .nickName(signUpReqDto.getNickName())
                .age(signUpReqDto.getAge())
                .sex(signUpReqDto.getSex())
                .build();

        memberRepository.save(member);
    }

}
