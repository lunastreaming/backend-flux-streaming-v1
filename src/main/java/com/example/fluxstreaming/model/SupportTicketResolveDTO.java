package com.example.fluxstreaming.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupportTicketResolveDTO {

    private String resolutionNote; // Nota de resolución visible para el cliente

}
