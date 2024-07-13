package com.dldnwls.personalproject.backend.domain.member.entity;

import com.dldnwls.personalproject.backend.domain.card.entity.Card;
import com.dldnwls.personalproject.backend.domain.channel.entity.Channel;
import com.dldnwls.personalproject.backend.domain.communitypost.entity.CommunityPost;
import com.dldnwls.personalproject.backend.domain.point.entity.Point;
import com.dldnwls.personalproject.backend.domain.subscribechannel.entity.SubscribeChannel;
import com.dldnwls.personalproject.backend.global.basetimeentity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK값

    private String email; //이메일

    private String password; //패스워드

    private String name; //이름

    private String nickName; //닉네임

    private int age; //나이

    private int sex; //성별

    private int pointBalance; //포인트 잔액

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Channel> channels;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<CommunityPost> communityPosts;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Point> points;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<SubscribeChannel> subscribeChannels;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Card> cards;

    @Builder
    public Member(String email, String password, String name, String nickName, int age, int sex) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
        this.pointBalance = 0; //회원가입할때 포인트는 0으로 기본 설정
    }

    /*변경 메소드*/
    //이메일 변경
    public void changeEmail(String email){
        this.email = email;
    }

    //비밀번호 변경
    public void changePassword(String password){
        this.password = password;
    }

    //이름 변경
    public void changeName(String name){
        this.name = name;
    }

    //닉네임 변경
    public void changeNickname(String nickName){
        this.nickName = nickName;
    }

    //나이 변경
    public void changeAge(int age){
        this.age = age;
    }

    //성별 변경
    public void changeSex(int sex){
        this.sex = sex;
    }
}
