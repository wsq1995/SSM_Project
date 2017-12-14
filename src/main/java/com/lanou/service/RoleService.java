package com.lanou.service;

import com.lanou.domain.Role;
import com.lanou.domain.RoleModule;

import java.util.List;

/**
 * Created by dllo on 17/12/8.
 */
public interface RoleService {

    /**
     * 查询所有角色
     *
     * @return
     */
    List<Role> findAll();

    /**
     * 添加角色
     *
     * @param role
     * @param moduleId
     * @return
     */
    String addRole(Role role, Integer[] moduleId);

    /**
     * 修改角色
     *
     * @param role
     */
    void updateRole(Role role);

    /**
     * 重新插入中间表的数据
     *
     * @param roleModule
     */
    void updateRoleModule(RoleModule roleModule);

    /**
     * 根据id找名字
     *
     * @param roleId
     * @return
     */
    List<Role> findNameById(int roleId);

    /**
     * 根据id删除角色
     *
     * @param roleId
     */
    void deleteRole(int roleId);

    /**
     * 根据id删除角色权限
     *
     * @param roleId
     */
    void deleteRoleModule(int roleId);

    //    在重新添加角色权限
    void addRoleModule(Integer[] module);

}
