package com.lanou.service;

import com.lanou.domain.Admin;

import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
public interface AdmainService {

    //    查询所有
    String login(Admin admin, String verifyCode);

    //    查询所有管理员
    List<Admin> findAllAdmin();

}
