package com.lanou.domain;

import org.springframework.stereotype.Component;

/**
 * Created by dllo on 17/12/7.
 */
@Component
public class Admin {
    private int adminId;
//    @NotBlank(message = "{admin.adminCode.NottBlank}")
//    @Length(max=6, min=3, message="{username.length}")
    private String adminCode;
//    @NotBlank(message = "{admin.Pwd.NotBlank}")
//    @Pattern(regexp = "/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{3,8}$/", message = "密码必须是3~8位数字和字母的组合")
    private String Pwd;
    private String name;
    private String telephone;
    private String email;
    private String enrolldate;

    public Admin() {
    }

    public Admin(int adminId) {
        this.adminId = adminId;
    }

    public Admin(String adminCode, String pwd, String name, String telephone, String email, String enrolldate) {
        this.adminCode = adminCode;
        Pwd = pwd;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.enrolldate = enrolldate;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrolldate='" + enrolldate + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(String enrolldate) {
        this.enrolldate = enrolldate;
    }




}
