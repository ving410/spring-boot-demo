package com.totoro.springboot.dao;

import com.totoro.springboot.bean.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author: maleah
 * @Date: 2018/5/5 23:08
 */
@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id获取demo对象.
     *
     * @param id
     * @return
     */

    public Demo getById(long id) {

        String sql = "select *from Demo where id=?";

        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);

        return jdbcTemplate.queryForObject(sql, rowMapper, id);

    }
}
