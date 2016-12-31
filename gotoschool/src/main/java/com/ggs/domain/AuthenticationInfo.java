package com.ggs.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "authentication_info", schema = "", catalog = "gotoschool")
public class AuthenticationInfo {
    private int authinfoid;
    private String orgName;
    private String authImg;

    @Id
    @Column(name = "authinfoid")
    public int getAuthinfoid() {
        return authinfoid;
    }

    public void setAuthinfoid(int authinfoid) {
        this.authinfoid = authinfoid;
    }

    @Basic
    @Column(name = "org_name")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "auth_img")
    public String getAuthImg() {
        return authImg;
    }

    public void setAuthImg(String authImg) {
        this.authImg = authImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthenticationInfo that = (AuthenticationInfo) o;

        if (authinfoid != that.authinfoid) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (authImg != null ? !authImg.equals(that.authImg) : that.authImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authinfoid;
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (authImg != null ? authImg.hashCode() : 0);
        return result;
    }
}
