package com.dldnwls.personalproject.backend.domain.point.entity;

import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date purchaseDate; //구입날짜

    private int purchasePoint; //구입액

    private boolean useType; //사용여부(true면 '사용' false면 '미사용')

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Builder
    public Point(Date purchaseDate, int purchasePoint, boolean useType) {
        this.purchaseDate = purchaseDate;
        this.purchasePoint = purchasePoint;
        this.useType = useType;
    }
}
