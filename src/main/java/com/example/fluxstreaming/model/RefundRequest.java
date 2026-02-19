package com.example.fluxstreaming.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefundRequest {

    private UUID buyerId;

}
