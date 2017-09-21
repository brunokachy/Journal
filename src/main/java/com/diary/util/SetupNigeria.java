/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diary.util;

import com.diary.entity.NigeriaBasic;
import com.diary.entity.NigeriaEconomy;
import com.diary.entity.Region;
import com.diary.entity.States;
import com.diary.service.DiaryService;
import java.text.ParseException;

public class SetupNigeria {

    public static void setUpNigeriaBasic(DiaryService service) {
        NigeriaBasic o = service.findByShortCode(ProjectConstant.NG);
        if (o == null) {
            try {
                o = new NigeriaBasic();
                o.setCallingCode("+234");
                o.setCurrency("Naira");
                o.setDemonym("Nigerian");
                o.setEconomicCapital("Lagos");
                o.setGovernment("Federal Presidential Republic");
                o.setHouseSpeaker("Yakubu Dogara");
                o.setIndependence("October 1st, 1960");
                o.setOfficialLanguage("English");
                o.setPoliticalCapital("Abuja");
                o.setPopulation("185,989,640");
                o.setPresident("Muhammadu Buhari");
                o.setSenatePresident("Bukola Saraki");
                o.setTotalArea("923,768 sqkm");
                o.setVicePresident("Yemi Osibanjo");
                o.setChiefJustice("W. S. Nkanu Onnoghen");
                o.setShortCode("NG");
                service.insertNigeriaBasic(o);
            } catch (ParseException e) {
                System.err.println("setUpNigeriaBasic Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    public static void setUpNigeriaEconomy(DiaryService service) {
        NigeriaEconomy o = service.findNigeriaEconomyByShortCode(ProjectConstant.NG);
        if (o == null) {
            try {
                o = new NigeriaEconomy();
                o.setPerCapita("$2,640");
                o.setGdp("$484,895,000,000");
                o.setShortCode("NG");
                service.insertNigeriaEconomy(o);
            } catch (ParseException e) {
                System.err.println("setUpNigeriaEconomy Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    public static void setUpRegion(DiaryService service) {
        Region r = service.findRegionByShortCode(ProjectConstant.NC);
        if (r == null) {
            try {
                r = new Region();
                r.setName(ProjectConstant.NORTH_CENTRAL);
                r.setShortCode("NC");
                r.setStateCount("6");
                service.insertRegion(r);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r2 = service.findRegionByShortCode(ProjectConstant.NE);
        if (r2 == null) {
            try {
                r2 = new Region();
                r2.setName(ProjectConstant.NORTH_EAST);
                r2.setShortCode("NE");
                r2.setStateCount("6");
                service.insertRegion(r2);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r3 = service.findRegionByShortCode(ProjectConstant.NW);
        if (r3 == null) {
            try {
                r3 = new Region();
                r3.setName(ProjectConstant.NORTH_WEST);
                r3.setShortCode("NW");
                r3.setStateCount("7");
                service.insertRegion(r3);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r4 = service.findRegionByShortCode(ProjectConstant.SE);
        if (r4 == null) {
            try {
                r4 = new Region();
                r4.setName(ProjectConstant.SOUTH_EAST);
                r4.setShortCode("SE");
                r4.setStateCount("6");
                service.insertRegion(r4);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r5 = service.findRegionByShortCode(ProjectConstant.SW);
        if (r5 == null) {
            try {
                r5 = new Region();
                r5.setName(ProjectConstant.SOUTH_WEST);
                r5.setShortCode("SW");
                r5.setStateCount("6");
                service.insertRegion(r5);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }

        Region r6 = service.findRegionByShortCode(ProjectConstant.SS);
        if (r6 == null) {
            try {
                r6 = new Region();
                r6.setName(ProjectConstant.SOUTH_SOUTH);
                r6.setShortCode("SS");
                r6.setStateCount("6");
                service.insertRegion(r6);
            } catch (ParseException e) {
                System.err.println("setUpRegion Error :::: " + e.getLocalizedMessage());
            }
        }
    }

    public static void setUpStates(DiaryService service) {

        States s1 = service.findByName(ProjectConstant.ABIA);
        if (s1 == null) {
            try {
                s1 = new States();
                s1.setName(ProjectConstant.ABIA);
                s1.setCode("AB");
                s1.setRegion(service.findRegionByShortCode(ProjectConstant.SE));
                s1.setCallingCode("");
                s1.setChiefJudge("");
                s1.setCreatedDate("27 August 1991");
                s1.setDeputyGovernor("Udo Oko Chukwu");
                s1.setEconomicCapital("Aba");
                s1.setGdp("$18,690,000,000");
                s1.setGovernor("Okezie Ikpeazu");
                s1.setHouseSpeaker("");
                s1.setLgaCount("17");
                s1.setPoliticalCapital("Umuahia");
                s1.setPopulation("2,845,380");
                s1.setTotalArea("6,320 sqkm");
                service.insertStates(s1);
            } catch (ParseException e) {
                System.err.println("setUpStates Error :::: " + e.getLocalizedMessage());
            }
        }

        States s2 = service.findByName(ProjectConstant.ADAMAWA);
        if (s2 == null) {
            try {
                s2 = new States();
                s2.setName(ProjectConstant.ADAMAWA);
                s2.setCode("AD");
                s2.setRegion(service.findRegionByShortCode(ProjectConstant.NE));
                s2.setCallingCode("");
                s2.setChiefJudge("");
                s2.setCreatedDate("27 August 1991");
                s2.setDeputyGovernor("Martin Babale");
                s2.setEconomicCapital("Yola");
                s2.setGdp("$4,580,000,000");
                s2.setGovernor("Bindo Jibrilla");
                s2.setHouseSpeaker("");
                s2.setLgaCount("21");
                s2.setPoliticalCapital("Yola");
                s2.setPopulation("3,178,950");
                s2.setTotalArea("36,917sqkm");
                service.insertStates(s2);
            } catch (ParseException e) {
                System.err.println("setUpStates Error :::: " + e.getLocalizedMessage());
            }
        }
    }
}
