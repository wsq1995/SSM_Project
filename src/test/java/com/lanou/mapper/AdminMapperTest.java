package com.lanou.mapper;

import com.lanou.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SSM-mybatis.xml")
public class AdminMapperTest {
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void login() throws Exception {
        Admin admin = new Admin();
        adminMapper.login(admin);
    }


}