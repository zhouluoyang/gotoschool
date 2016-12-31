package com.ggs.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_has_role", schema = "", catalog = "gotoschool")
@IdClass(UserHasRolePK.class)
public class UserHasRole {
    private int userid;
    private int roleid;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "roleid")
    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasRole that = (UserHasRole) o;

        if (userid != that.userid) return false;
        if (roleid != that.roleid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + roleid;
        return result;
    }
}
