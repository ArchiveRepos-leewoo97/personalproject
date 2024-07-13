package com.dldnwls.personalproject.backend.domain.card.entity;

import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import com.dldnwls.personalproject.backend.global.basetimeentity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@RequiredArgsConstructor
@Entity
public class Card extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber; //카드번호

    private int cardBalance; //카드잔액

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Builder
    public Card(String cardNumber, int cardBalance, Member member) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.member = member;
    }

    //카드 발급(카드를 발급받을때, 자동으로 카드 번호를 생성해주고, 100만원 이하의 랜덤한 금액을 카드 잔액에 충전해준다.)
    public void createCard(){
        Random random = new Random();
        StringBuilder generatedNumber = new StringBuilder();

        for(int i=0; i<16; i++){
            generatedNumber.append(random.nextInt(10));
        }

        this.cardNumber = generatedNumber.toString();
        this.cardBalance = random.nextInt(1000000);
    }

    //카드 잔액 충전
    public void chargeCardBalance(int chargeAmount){
        this.cardBalance += chargeAmount;
    }
}
