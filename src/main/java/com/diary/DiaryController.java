package com.diary;

import com.diary.entity.NigeriaBasic;
import com.diary.entity.NigeriaEconomy;
import com.diary.entity.Region;
import com.diary.entity.States;
import com.diary.service.DiaryService;
import com.diary.util.ProjectConstant;
import java.util.List;
import javax.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {

    @Autowired
    DiaryService service;

    @RequestMapping("/")
    String index() {
        //  return "Hello World! I am here";

        return "index";
    }

    @RequestMapping("/regions")
    public List<Region> regions() {
        List<Region> rs = service.findAllRegion();
        return rs;
    }

    @RequestMapping("/basicInfo")
    public NigeriaBasic basicInfo() {
        NigeriaBasic o = service.findByShortCode(ProjectConstant.NG);
        return o;
    }

    @RequestMapping("/economicInfo")
    public NigeriaEconomy economicInfo() {
        NigeriaEconomy o = service.findNigeriaEconomyByShortCode(ProjectConstant.NG);
        return o;
    }

    @RequestMapping("/states")
    public List<States> states() {
        List<States> ses = service.findAllStates();
        return ses;
    }

    @RequestMapping("/stateByCode")
    public States stateByCode(@QueryParam("code") String code) {
        States s = service.findByCode(code);
        return s;
    }

    @RequestMapping("/statesByRegion")
    public List<States> statesByRegion(@QueryParam("regionCode") String regionCode) {
        Region r = service.findRegionByShortCode(regionCode);
        List<States> ses = service.findByRegion(r);
        return ses;
    }

}
