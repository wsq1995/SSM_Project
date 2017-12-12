package com.lanou.service.impl;

import com.lanou.domain.Role;
import com.lanou.domain.RoleModule;
import com.lanou.mapper.RoleMapper;
import com.lanou.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/8.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public String addRole(Role role, Integer[] moduleId) {
        if (role.getRoleName().equals("") || role.getRoleName() == null) {
            return "nameNull";
        } else if (moduleId[0] == 0) {
            return "integerError";
        } else {
            roleMapper.addRole(role);
            for (int i = 0; i < moduleId.length; i++) {
                Integer integer = moduleId[i];
                roleMapper.addtModule(role.getRoleId(), integer);
            }
            return "add";
        }
    }
}
