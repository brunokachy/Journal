/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diary.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class States implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private String name;

    @Column(unique = true)
    private String code;

    @ManyToOne
    private Region region;

    private String politicalCapital;

    private String economicCapital;

    private String governor;

    private String deputyGovernor;

    private String houseSpeaker;

    private String chiefJudge;

    private String createdDate;

    private String totalArea;

    private String population;

    private String callingCode;

    private String lgaCount;

    private String gdp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getPoliticalCapital() {
        return politicalCapital;
    }

    public void setPoliticalCapital(String politicalCapital) {
        this.politicalCapital = politicalCapital;
    }

    public String getEconomicCapital() {
        return economicCapital;
    }

    public void setEconomicCapital(String economicCapital) {
        this.economicCapital = economicCapital;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public String getDeputyGovernor() {
        return deputyGovernor;
    }

    public void setDeputyGovernor(String deputyGovernor) {
        this.deputyGovernor = deputyGovernor;
    }

    public String getHouseSpeaker() {
        return houseSpeaker;
    }

    public void setHouseSpeaker(String houseSpeaker) {
        this.houseSpeaker = houseSpeaker;
    }

    public String getChiefJudge() {
        return chiefJudge;
    }

    public void setChiefJudge(String chiefJudge) {
        this.chiefJudge = chiefJudge;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getLgaCount() {
        return lgaCount;
    }

    public void setLgaCount(String lgaCount) {
        this.lgaCount = lgaCount;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof States)) {
            return false;
        }
        States other = (States) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diary.entity.State[ id=" + id + " ]";
    }

}
