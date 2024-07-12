package com.dldnwls.personalproject.backend.domain.member.repo;

import com.dldnwls.personalproject.backend.domain.member.entity.Member;
import com.dldnwls.personalproject.backend.domain.member.repo.custom.MemberRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}
