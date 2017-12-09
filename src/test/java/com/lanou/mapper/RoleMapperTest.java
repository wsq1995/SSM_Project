package com.lanou.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SSM-mybatis.xml")
public class RoleMapperTest {
    @Resource
    private RoleMapper roleMapper;
    @Test
    public void findAllRole() throws Exception {
        roleMapper.findAllRole().forEach(System.out::println);
    }

}