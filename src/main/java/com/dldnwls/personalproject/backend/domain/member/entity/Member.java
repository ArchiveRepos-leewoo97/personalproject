package com.dldnwls.personalproject.backend.domain.member.entity;

import com.dldnwls.personalproject.backend.domain.channel.entity.Channel;
import com.dldnwls.personalproject.backend.domain.communitypost.entity.CommunityPost;
import com.dldnwls.personalproject.backend.domain.member.dto.request.SignUpReqDto;
import com.dldnwls.personalproject.backend.domain.point.entity.Point;
import com.dldnwls.personalproject.backend.domain.subscribechannel.entity.SubscribeChannel;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK값

    private String email; //이메일

    private String password; //패스워드

    private String name; //이름

    private String nickName; //닉네임

    private int age; //나이

    private int sex; //성별

    private String cardNumber; //카드 번호 16자리

    private Long cardBalance; //카드 잔액

    private int pointBalance; //포인트 잔액

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Channel> channels;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<CommunityPost> communityPosts;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Point> points;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<SubscribeChannel> subscribeChannels;

    @Builder
    public Member(String email, String password, String name, String nickName, int age, int sex) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
    }

}
