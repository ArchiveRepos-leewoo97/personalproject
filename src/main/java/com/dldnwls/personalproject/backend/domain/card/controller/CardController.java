package com.dldnwls.personalproject.backend.domain.card.controller;

import com.dldnwls.personalproject.backend.domain.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CardController {

    private final CardService cardService;

    @PostMapping("/card/issuance")
    public ResponseEntity<?> cardIssuance(){
        cardService.cardIssuance();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("카드 발급이 완료되었습니다.");
    }

}
