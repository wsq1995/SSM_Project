package com.lanou.domain;

/**
 * Created by dllo on 17/12/9.
 */
public class AdminRoleModule {
    private int adminId;
    private String name;
    private Module module;

    public AdminRoleModule() {
    }

    public AdminRoleModule(int adminId, String name, Module module) {
        this.adminId = adminId;
        this.name = name;
        this.module = module;
    }

    @Override
    public String toString() {
        return "AdminRoleModule{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", module=" + module +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
