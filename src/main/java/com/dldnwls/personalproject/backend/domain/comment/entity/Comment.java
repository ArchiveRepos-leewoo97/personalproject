package com.dldnwls.personalproject.backend.domain.comment.entity;

import com.dldnwls.personalproject.backend.domain.communitypost.entity.CommunityPost;
import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; //내용

    private Date registTime; //댓글 등록시간

    @ManyToOne(fetch = FetchType.LAZY)
    CommunityPost communityPost;

    @ManyToOne(fetch = FetchType.LAZY)
    Member member;

    @Builder
    public Comment(String content, Date registTime) {
        this.content = content;
        this.registTime = registTime;
    }
}
