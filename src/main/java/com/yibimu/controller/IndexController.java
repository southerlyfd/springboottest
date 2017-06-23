package com.yibimu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/6/16.
 */

/**
 * @RestController 标注该类的所有请求方法为返回json格式 不做视图解析
 *
 */
@RequestMapping("/springBoot")
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "success";
    }
    @RequestMapping("/index1")
    public String index1(){
        return "success1";
    }
    @RequestMapping("/listIndex")
    public List<String> listIndex(){
        List<String> list = new ArrayList<String>();
        list.add("index1");
        list.add("index2");
        list.add("index3");
        return list;
    }

    /**
     * 异常捕获
     * @param request
     * @return
     */
    @RequestMapping("/demoError")
    public Integer demoError(HttpServletRequest request){
        String id = request.getParameter("id");
        Integer id1 = Integer.parseInt(id);
        return id1;
    }
}
