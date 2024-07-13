package com.dldnwls.personalproject.backend.domain.card.controller;

import com.dldnwls.personalproject.backend.domain.card.service.CardService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CardController {

    private final CardService cardService;

    @Operation(summary = "카드 발급")
    @PostMapping("/card/issuance")
    public ResponseEntity<?> cardIssuance(String email){
        try {
            cardService.cardIssuance(email);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("카드 발급이 완료되었습니다.");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("알 수 없는 오류로 카드 발급에 실패하였습니다.");
        }
    }

}
