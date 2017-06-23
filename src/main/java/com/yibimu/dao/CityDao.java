package com.yibimu.dao;
import com.yibimu.entity.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by admin on 2017/6/19.
 */
public interface CityDao {
    @Select("select * from city;")
    List<City> selectCity();
}
