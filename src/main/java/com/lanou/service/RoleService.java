package com.lanou.service;

import com.lanou.domain.Role;
import com.lanou.domain.RoleModule;

import java.util.List;

/**
 * Created by dllo on 17/12/8.
 */
public interface RoleService {

    //    查询所有角色
    List<Role> findAll();
//    添加角色
    String addRole(Role role,Integer[] moduleId);



}
