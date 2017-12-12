package com.lanou.mapper;

import com.lanou.domain.Admin;
import com.lanou.domain.Role;
import com.lanou.domain.RoleModule;

import java.util.List;

/**
 * Created by dllo on 17/12/8.
 */
public interface RoleMapper {

    //    查询所有角色
    List<Role> findAll();

    //    添加角色
    void addRole(Role role);

    void addtModule(int roleId, Integer moduleId);

//    根据名字查找信息
//    Role findByName(Role role);


}
