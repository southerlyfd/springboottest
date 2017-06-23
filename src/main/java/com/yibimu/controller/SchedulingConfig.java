package com.yibimu.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务调度
 * Created by admin on 2017/6/19.
 */
@Configuration
@EnableScheduling // 启用定时任务
public class SchedulingConfig {
    int count = 0;

    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler(){
        count++;
        System.out.println("定时任务已经发出，这是第" + count + "次");
        System.out.println();
    }




}
