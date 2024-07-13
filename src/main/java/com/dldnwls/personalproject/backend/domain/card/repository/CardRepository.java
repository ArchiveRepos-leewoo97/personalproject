package com.dldnwls.personalproject.backend.domain.card.repository;

import com.dldnwls.personalproject.backend.domain.card.entity.Card;
import com.dldnwls.personalproject.backend.domain.card.repository.custom.CardRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>, CardRepositoryCustom {

}
