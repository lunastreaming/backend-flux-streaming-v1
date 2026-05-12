package com.example.fluxstreaming.model;

public record DashboardIncomeDTO(
        String concepto,
        Long totalOperaciones,
        java.math.BigDecimal ingresosTotales,
        String moneda
) {}
