package com.lanou.controller;

import com.lanou.service.RoleService;
import com.lanou.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
    public String role_list(){
        return "success";
    }

    @RequestMapping("/role")
    public String role(){
        return "role/role_list";
    }
//    以上只为跳转页面


    @RequestMapping("/findAllRole")
    @ResponseBody
    public AjaxResult findAllRole() {
        return new AjaxResult(roleService.findAllRole());

    }
}
