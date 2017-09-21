package com.diary.repository;

import com.diary.entity.NigeriaBasic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NigeriaBasicRepository extends JpaRepository<NigeriaBasic, Long> {

    NigeriaBasic findByShortCode(String shortCode);

}
