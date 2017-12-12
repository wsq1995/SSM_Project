package com.lanou.controller;

import com.lanou.domain.Role;
import com.lanou.domain.RoleModule;
import com.lanou.service.RoleService;
import com.lanou.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/8.
 */
@Controller
public class RoleController {
    @Resource
    private RoleService roleService;

    //    以下只为跳转页面
    @RequestMapping("/role_list")
    @ResponseBody
    public String role_list() {
        return "success";
    }

    @RequestMapping("/role")
    public String role() {
        return "role/role_list";
    }
//    以上只为跳转页面

    @RequestMapping("/role_Add")
    public String add() {
        return "role/role_add";
    }

    //    查询所有角色
    @RequestMapping("/AdminFindAll")
    @ResponseBody
    public AjaxResult AdminFindAll() {
        return new AjaxResult(roleService.findAll());
    }

    //    添加角色
    @RequestMapping("/addRole")
    @ResponseBody
    public String addRole(Role role, Integer[] moduleId) {
        String s1 = roleService.addRole(role, moduleId);
        System.out.println(s1);
        return s1;
    }

    @RequestMapping("/list")
    public String list() {
        return "role/role_list";
    }


}
