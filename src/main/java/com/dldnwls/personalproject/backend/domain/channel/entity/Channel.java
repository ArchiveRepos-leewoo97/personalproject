package com.dldnwls.personalproject.backend.domain.channel.entity;

import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String channelName; //채널 명

    private String channelIntro; //채널 소개

    private int subscriber; //구독자 수

    private String communityName; //커뮤니티 명

    private String communityIntro; //커뮤니티 소개

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
}
