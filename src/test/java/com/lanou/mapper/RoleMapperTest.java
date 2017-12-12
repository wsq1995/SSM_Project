package com.lanou.mapper;

import com.lanou.domain.Role;
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
    public void saveRole() throws Exception {
        Role role = new Role("校长");
        roleMapper.addRole(role);
    }

    @Test
    public void findAll() throws Exception {
        roleMapper.findAll().forEach(System.out::println);
    }

}