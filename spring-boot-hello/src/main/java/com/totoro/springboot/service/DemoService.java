package com.totoro.springboot.service;

import com.totoro.springboot.bean.Demo;
import com.totoro.springboot.dao.DemoDao;
import com.totoro.springboot.dao.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 提供Demo服务类
 *
 * @Author: maleah
 * @Date: 2018/5/5 22:23
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    @Resource
    private DemoDao demoDao;


    @Transactional
    public void save(Demo demo) {

        demoRepository.save(demo);

    }

    public Demo getById(long id) {
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);

    }
}
