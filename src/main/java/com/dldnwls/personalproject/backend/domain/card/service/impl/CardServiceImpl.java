package com.dldnwls.personalproject.backend.domain.card.service.impl;

import com.dldnwls.personalproject.backend.domain.card.entity.Card;
import com.dldnwls.personalproject.backend.domain.card.repository.CardRepository;
import com.dldnwls.personalproject.backend.domain.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;


    @Override
    public void cardIssuance() {
        Card card = new Card();
        card.createCard();
        cardRepository.save(card);
    }

}
