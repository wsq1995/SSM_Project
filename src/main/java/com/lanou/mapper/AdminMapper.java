package com.lanou.mapper;

import com.lanou.domain.Admin;

import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
public interface AdminMapper {
//    查询名字
    Admin login(Admin admin);

//    查询所有管理员
    List<Admin>findAllAdmin();









}
