package com.totoro.springboot.dao;

import com.totoro.springboot.bean.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * @Description:
 * @Author: maleah
 * @Date: 2018/5/5 22:25
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {

}
