package com.example.fluxstreaming.model;

import java.math.BigDecimal;

public record CategoriaVentasDTO(
        String categoria,
        Long cantidadVendida,
        BigDecimal totalRecaudado
) {}
