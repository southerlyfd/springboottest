package com.yibimu.service;

import com.yibimu.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/21.
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectUser();
    /**
     * 根据用户名查找用户信息
     * @param user_name
     * @return
     */
    List<User> findByName(String user_name);
    /**
     * 单个添加用户
     * @param map
     * @return
     */
    String insertByUser(Map<String, Object> map);

    /**
     * 根据用户ID删除单个用户
     * @param map
     * @return
     */
    String deleteUser(Map<String, Object> map);

    String updateUser(Map<String, Object> map);
}
