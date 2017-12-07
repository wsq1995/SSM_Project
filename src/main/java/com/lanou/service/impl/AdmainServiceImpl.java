package com.lanou.service.impl;

import com.lanou.domain.Admin;
import com.lanou.mapper.AdminMapper;
import com.lanou.service.AdmainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
@Service
public class AdmainServiceImpl implements AdmainService {
    @Resource
    private AdminMapper adminMapper;

    @Resource
    private HttpSession session;

    @Override
    public String login(Admin admin,String verifyCode) {
        String adminCode = admin.getAdminCode();
        String pwd = admin.getPwd();
        String newVerifyCode = (String) session.getAttribute("verifyCode");

        if (adminCode == null || adminCode.equals("") && adminCode.equals(admin.getAdminCode())) {
           return "nameError";
        } else if (pwd == null || pwd.equals("") && pwd.equals(admin.getPwd())) {
            return "PwdError";
        }else if (!verifyCode.equalsIgnoreCase(newVerifyCode) && newVerifyCode != null && !newVerifyCode.equals("")) {
            return "codeError";
        }
        return "index";
    }
}
