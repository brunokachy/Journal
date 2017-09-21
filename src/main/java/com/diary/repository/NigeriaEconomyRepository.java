package com.diary.repository;

import com.diary.entity.NigeriaEconomy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NigeriaEconomyRepository extends JpaRepository<NigeriaEconomy, Long> {

    NigeriaEconomy findByShortCode(String shortCode);
}
