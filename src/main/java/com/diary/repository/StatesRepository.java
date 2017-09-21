/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diary.repository;

import com.diary.entity.Region;
import com.diary.entity.States;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatesRepository extends JpaRepository<States, Long> {

    States findByCode(String code);
    
    States findByName(String name);

    List<States> findByRegion(Region region);

}
