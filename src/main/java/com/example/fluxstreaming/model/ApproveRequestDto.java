package com.example.fluxstreaming.model;


import java.util.UUID;

public record ApproveRequestDto(
        UUID paymentMethodId
) {
}
