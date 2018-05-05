package com.totoro.springboot.controller;

/**
 * @Author: maleah
 * @Date: 2018/5/5 22:28
 */

import com.alibaba.fastjson.JSONObject;
import com.totoro.springboot.bean.Demo;
import com.totoro.springboot.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

    @Resource
    private DemoService demoService;

    /**
     * 测试保存数据方法.
     *
     * @return
     */
    @RequestMapping("/save")
    public String save() {

        Demo d = new Demo();
        d.setName("maleah");
        demoService.save(d);//保存数据.

        return "ok.Demo2Controller.save";
    }

    @RequestMapping("/getFastJson")
    public String getFastJson() {
        Demo demo = new Demo();
        demo.setId(3);
        demo.setName("李四");
        return JSONObject.toJSONString(demo);
    }

    //地址：http://127.0.0.1:8080/demo2/getById?id=1
    @RequestMapping("/getById")
    public Demo getById(long id) {

        return demoService.getById(id);

    }

}