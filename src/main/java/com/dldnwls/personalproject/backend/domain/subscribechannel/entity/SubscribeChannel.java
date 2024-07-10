package com.dldnwls.personalproject.backend.domain.subscribechannel.entity;

import com.dldnwls.personalproject.backend.domain.channel.entity.Channel;
import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
public class SubscribeChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;

    private Date endDate;

    private int tier;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Channel channel;

    @Builder
    public SubscribeChannel(Date startDate, Date endDate, int tier) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.tier = tier;
    }
}
