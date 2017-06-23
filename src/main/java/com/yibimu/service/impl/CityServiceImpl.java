package com.yibimu.service.impl;

import com.yibimu.dao.CityDao;
import com.yibimu.entity.City;
import com.yibimu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/6/19.
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    public List<City> selectCity() {
         return cityDao.selectCity();
    }

}
