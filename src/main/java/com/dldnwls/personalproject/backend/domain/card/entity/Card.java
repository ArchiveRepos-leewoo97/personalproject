package com.dldnwls.personalproject.backend.domain.card.entity;

import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber; //카드번호

    private String cardBalance; //카드잔액

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
}
