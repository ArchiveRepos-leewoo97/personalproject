package com.dldnwls.personalproject.backend.domain.card.service.impl;

import com.dldnwls.personalproject.backend.domain.card.entity.Card;
import com.dldnwls.personalproject.backend.domain.card.repository.CardRepository;
import com.dldnwls.personalproject.backend.domain.card.service.CardService;
import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import com.dldnwls.personalproject.backend.domain.member.repo.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final MemberRepository memberRepository;


    @Override
    public void cardIssuance(String email) {
        //이메일로 Member 찾기
        Member member = memberRepository.findByEmail(email);
        //Card Entity 생성
        Card card = Card.builder()
                        .member(member)
                        .build();
        //카드 발급 Method
        card.createCard();
        //Card 테이블에 저장
        cardRepository.save(card);
    }

}
