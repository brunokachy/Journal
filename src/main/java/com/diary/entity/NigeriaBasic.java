package com.diary.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NigeriaBasic implements Serializable {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    private String politicalCapital;

    private String economicCapital;

    private String officialLanguage;

    private String demonym;

    private String government;

    private String president;

    private String vicePresident;

    private String senatePresident;

    private String houseSpeaker;

    private String chiefJustice;

    private String independence;

    private String totalArea;

    private String population;

    private String currency;

    private String callingCode;

    private String shortCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getVicePresident() {
        return vicePresident;
    }

    public void setVicePresident(String vicePresident) {
        this.vicePresident = vicePresident;
    }

    public String getSenatePresident() {
        return senatePresident;
    }

    public void setSenatePresident(String senatePresident) {
        this.senatePresident = senatePresident;
    }

    public String getHouseSpeaker() {
        return houseSpeaker;
    }

    public void setHouseSpeaker(String houseSpeaker) {
        this.houseSpeaker = houseSpeaker;
    }

    public String getChiefJustice() {
        return chiefJustice;
    }

    public void setChiefJustice(String chiefJustice) {
        this.chiefJustice = chiefJustice;
    }

    public String getIndependence() {
        return independence;
    }

    public void setIndependence(String independence) {
        this.independence = independence;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public NigeriaBasic() {
    }

    @Override
    public String toString() {
        return "Overview{" + "id=" + id + ", politicalCapital=" + politicalCapital + ", economicCapital=" + economicCapital + ", officialLanguage=" + officialLanguage + ", demonym=" + demonym + ", government=" + government + ", president=" + president + ", vicePresident=" + vicePresident + ", senatePresident=" + senatePresident + ", houseSpeaker=" + houseSpeaker + ", chiefJustice=" + chiefJustice + ", independence=" + independence + ", totalArea=" + totalArea + ", population=" + population + ", currency=" + currency + ", callingCode=" + callingCode + ", shortCode=" + shortCode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NigeriaBasic other = (NigeriaBasic) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}
