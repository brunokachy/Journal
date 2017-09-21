/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diary.service;

import com.diary.entity.NigeriaBasic;
import com.diary.entity.NigeriaEconomy;
import com.diary.entity.Region;
import com.diary.entity.States;
import com.diary.repository.NigeriaBasicRepository;
import com.diary.repository.NigeriaEconomyRepository;
import com.diary.repository.RegionRepository;
import com.diary.repository.StatesRepository;
import java.text.ParseException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {

    private static final Logger log = LoggerFactory.getLogger(DiaryService.class);

    @Autowired
    StatesRepository sr;

    @Autowired
    NigeriaBasicRepository nbr;

    @Autowired
    NigeriaEconomyRepository ner;

    @Autowired
    RegionRepository rr;

    public List<States> findAllStates() {
        return sr.findAll();
    }

    public List<States> findByRegion(Region region) {
        return sr.findByRegion(region);
    }

    public List<Region> findAllRegion() {
        return rr.findAll();
    }

    public States findByCode(String code) {
        return sr.findByCode(code);
    }

    public void insertStates(States s) throws ParseException {
        sr.save(s);
    }

    public NigeriaBasic findByShortCode(String shortCode) {
        return nbr.findByShortCode(shortCode);
    }

    public NigeriaEconomy findNigeriaEconomyByShortCode(String shortCode) {
        return ner.findByShortCode(shortCode);
    }

    public void insertNigeriaBasic(NigeriaBasic nb) throws ParseException {
        nbr.save(nb);
    }

    public void insertNigeriaEconomy(NigeriaEconomy ne) throws ParseException {
        ner.save(ne);
    }

    public Region findRegionByShortCode(String shortCode) {
        return rr.findByShortCode(shortCode);
    }

    public void insertRegion(Region r) throws ParseException {
        rr.save(r);
    }

    public States findByName(String name) {
        return sr.findByName(name);
    }

}
