package com.lanou.controller;

import com.lanou.domain.Admin;
import com.lanou.service.AdmainService;
import com.lanou.utils.AjaxResult;
import com.lanou.utils.VerifyCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by dllo on 17/12/7.
 */
@Controller
public class AdminController {
    @Resource
    private AdmainService admainService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(Admin admin, String verifyCode, HttpSession session) {
        session.setAttribute("adminCode", admin.getAdminCode());
        session.setAttribute("Pwd", admin.getPwd());
        String error = admainService.login(admin, verifyCode);
        return error;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 验证码验证
     *
     * @param session
     * @param response
     * @throws IOException
     */
    @RequestMapping("/getVerifyCode")
    public void getVerifycode(HttpSession session, HttpServletResponse response) throws IOException {
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();
        session.setAttribute("verifyCode", verifyCode.getText());
        OutputStream os = response.getOutputStream();
        VerifyCode.output(image, os);
    }

    /**
     * 转到查询所有管理员界面
     * @return
     */
    @RequestMapping("/admin_list")
    public String admin_list() {
        return "admin/admin_list";
    }

    /**
     * 查询所有管理员
     */
    @RequestMapping("/findAllAdmin")
    @ResponseBody
    public AjaxResult findAllAdmin(){
        return new AjaxResult(admainService.findAllAdmin());
    }


}
