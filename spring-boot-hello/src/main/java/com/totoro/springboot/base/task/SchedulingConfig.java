package com.totoro.springboot.base.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author: maleah
 * @Date: 2018/5/5 23:37
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {

        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");

    }
}
