package com.dldnwls.personalproject.backend.domain.communitypost.entity;

import com.dldnwls.personalproject.backend.domain.channel.entity.Channel;
import com.dldnwls.personalproject.backend.domain.comment.entity.Comment;
import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Entity
public class CommunityPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int notice; //공지설정(채널주인 화면에만 보인다. 미설정시 0, 설정시 1)

    private int type; //게시글 종류(0:정보, 1:먹방, 2:게임추천, 3:잡담, 4: 자유)

    private String title; //제목

    private String content; //게시글 내용

    private Date registTime; //게시글 등록시간

    @OneToMany(mappedBy = "communityPost", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Channel channel;

}
