package com.yibimu.controller;

import com.yibimu.entity.City;
import com.yibimu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/6/19.
 */
@RestController
public class CityContoller {
    @Autowired
    private CityService cityService;
    /**
     * 查询所有信息
     */
    @RequestMapping("/selectCityService")
    public List<City> selectCity(){
        return cityService.selectCity();
    }

}
