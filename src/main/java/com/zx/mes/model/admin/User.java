package com.zx.mes.model.admin;

import java.util.Date;
import java.util.List;

public class User {
    private String id;

    private Date createdatetime;

    private Date modifydatetime;

    private String name;

    private String pwd;

    private List<UserRoleKey> userRoleKeys;



    public List<UserRoleKey> getUserRoleKeys() {
        return userRoleKeys;
    }

    public void setUserRoleKeys(List<UserRoleKey> userRoleKeys) {
        this.userRoleKeys = userRoleKeys;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Date getModifydatetime() {
        return modifydatetime;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}