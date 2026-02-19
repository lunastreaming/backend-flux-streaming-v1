package com.example.fluxstreaming.repository;

import com.example.fluxstreaming.model.SellerProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SellerProfileRepository extends JpaRepository<SellerProfileEntity, UUID> {
}
