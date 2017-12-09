package com.lanou.domain;


import org.springframework.stereotype.Component;

/**
 * Created by dllo on 17/12/7.
 */
@Component
public class Admin {
    private int adminId;
    private String adminCode;
    private String Pwd;
    private String name;
    private String telephone;
    private String email;
    private String enrolldate;

    private Role role;
    private AdminRole adminRole;
    private Module module;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrolldate='" + enrolldate + '\'' +
                ", role=" + role +
                ", adminRole=" + adminRole +
                ", module=" + module +
                '}';
    }

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public AdminRole getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(AdminRole adminRole) {
        this.adminRole = adminRole;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
