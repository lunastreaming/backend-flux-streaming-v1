package com.example.fluxstreaming.model;

import java.util.List;

public record BulkActiveRequest(List<Long> ids) {
}
