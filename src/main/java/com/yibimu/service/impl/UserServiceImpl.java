package com.yibimu.service.impl;

import com.yibimu.dao.UserDao;
import com.yibimu.entity.User;
import com.yibimu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/21.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public List<User> selectUser() {
        return userDao.selectUser();
    }
    public List<User> findByName(String user_name) {
        return userDao.findByName(user_name);
    }
    public String insertByUser(Map<String, Object> map) {
        userDao.insertByUser(map);
        return "SUCCESS";
    }
    public String deleteUser(Map<String, Object> map) {
        userDao.deleteUser(map);
        return "DELETESCCESS";
    }

    public String updateUser(Map<String, Object> map) {
        userDao.updateUser(map);
        return "UPDATESCCESS";
    }
}
