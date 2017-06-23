package com.yibimu.controller;

import com.yibimu.entity.User;
import com.yibimu.entity.UserModel;
import com.yibimu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/21.
 */
@RequestMapping("/user")
@RestController
public class UserContoller {
    @Autowired
    private UserService userService;

    /**
     * 查询：查询所有用户信息
     * @return
     */
    @RequestMapping("/all")
    public List<User> selectUser(){
        return userService.selectUser();
    }

    /**
     * 查询：通过姓名查询单个用户信息
     * @param request
     * @return
     */
    @RequestMapping("/find")
    public List<User> findByName(HttpServletRequest request){
        String user_name = request.getParameter("user_name");
        return userService.findByName(user_name);
    }

    @RequestMapping("/update")
    public String updateUser(UserModel userModel){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", userModel.getOrg_id());
        map.put("user_id", userModel.getUser_id());
        map.put("user_name", userModel.getUser_name());
        map.put("user_sex", userModel.getUser_sex());
        map.put("user_age", userModel.getUser_age());
        return userService.updateUser(map);
    }

    /**
     * 删除：根据用户ID删除单个用户
     * @param userModel
     * @return
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(UserModel userModel){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user_id", userModel.getUser_id());
        return userService.deleteUser(map);
    }

    /**
     * 1:直接把表单的参数写在Controller相应的方法的形参中，
     *  适用于get方式提交，不适用于post方式提交。
     *
     *  url形式：http://localhost:9090/user/insertByUser5?org_id=10012&create_date=20170621&user_id=1012&user_name=夏雨荷&user_sex=0&user_age=50
     *  提交的参数需要和Controller方法中的入参名称一致。
     * @param org_id
     * @param create_date
     * @param user_id
     * @param user_name
     * @param user_sex
     * @param user_age
     * @return
     */
    @RequestMapping("/insertByUser5")
    public String insertByUser5(String org_id, String create_date, String user_id, String user_name, String user_sex, String user_age){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", org_id);
        map.put("create_date", create_date);
        map.put("user_id", user_id);
        map.put("user_name", user_name);
        map.put("user_sex", user_sex);
        map.put("user_age", user_age);
        return userService.insertByUser(map);
    }
    /**
     * 2：通过HttpServletRequest接收，Post方式和get方式都可以
     * @param request
     * @return
     * @throws ParseException
     *
     * 新增一个用户信息
     * post请求
     */
    @RequestMapping("/insertByUser")
    public String insertByUser(HttpServletRequest request){
        String org_id = request.getParameter("org_id"); // 获取用户单位ID
        String create_date = request.getParameter("create_date"); // 获取创建日期
        String user_id = request.getParameter("user_id"); // 获取用户ID
        String user_name = request.getParameter("user_name"); // 获取用户名
        String user_sex = request.getParameter("user_sex"); // 获取用户性别：男-1；女-0
        String user_age = request.getParameter("user_age"); // 获取用户年龄
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", org_id);
        map.put("create_date", create_date);
        map.put("user_id", user_id);
        map.put("user_name", user_name);
        map.put("user_sex", user_sex);
        map.put("user_age", user_age);
        return userService.insertByUser(map);
    }

    /**
     * 3：通过一个bean来接收,post方式和get方式都可以
     * ①、建立一个和表单中参数对应的bean(UserModel)
     * ②、用这个bean来封装接收的参数
     *
     * @param userModel
     * @return
     */
    @RequestMapping("/insertByUser1")
    public String insertByUser1(UserModel userModel){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", userModel.getOrg_id());
        map.put("create_date", userModel.getCreate_date());
        map.put("user_id", userModel.getUser_id());
        map.put("user_name", userModel.getUser_name());
        map.put("user_sex", userModel.getUser_sex());
        map.put("user_age", userModel.getUser_age());
        return userService.insertByUser(map);
    }

    /**
     * 4：通过@PathVariable获取路径中的参数
     * GET请求
     * 注意：不适合传中文参数
     *
     * @param org_id
     * @param create_date
     * @param user_id
     * @param user_name
     * @param user_sex
     * @param user_age
     * @return
     */
    @RequestMapping(value = "/insertByUser2/{org_id}/{create_date}/{user_id}/{user_name}/{user_sex}/{user_age}", method = RequestMethod.GET )
    public String insertByUser2(@PathVariable String org_id, @PathVariable String create_date,@PathVariable String user_id,@PathVariable String user_name,@PathVariable String user_sex,@PathVariable String user_age){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", org_id);
        map.put("create_date", create_date);
        map.put("user_id", user_id);
        map.put("user_name", user_name);
        map.put("user_sex", user_sex);
        map.put("user_age", user_age);
        return userService.insertByUser(map);
    }

    /**
     * 5：使用@ModelAttribute注解获取POST请求的FORM表单数据
     *
     * UserModel 做模型（字段为String类型）
     * @param user
     * @return
     */
    @RequestMapping(value = "/insertByUser3", method = RequestMethod.POST)
    public String insertByUser3(@ModelAttribute("user") UserModel user){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", user.getOrg_id());
        map.put("create_date", user.getCreate_date());
        map.put("user_id", user.getUser_id());
        map.put("user_name", user.getUser_name());
        map.put("user_sex", user.getUser_sex());
        map.put("user_age", user.getUser_age());
        return userService.insertByUser(map);
    }
    /**
     * 6：用注解@RequestParam绑定请求参数到方法入参
     *注意：当请求参数username不存在时会有异常发生,可以通过设置属性required=false解决,
     * 例如: @RequestParam(value="username", required=false)
     *
     * @param org_id
     * @param create_date
     * @param user_id
     * @param user_name
     * @param user_sex
     * @param user_age
     * @return
     */
    @RequestMapping(value = "/insertByUser4", method = RequestMethod.POST)
    public String insertByUser4(@RequestParam("org_id") String  org_id, @RequestParam String create_date,@RequestParam String user_id,@RequestParam String user_name,@RequestParam String user_sex,@RequestParam String user_age){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("org_id", org_id);
        map.put("create_date", create_date);
        map.put("user_id", user_id);
        map.put("user_name", user_name);
        map.put("user_sex", user_sex);
        map.put("user_age", user_age);
        return userService.insertByUser(map);
    }
}
