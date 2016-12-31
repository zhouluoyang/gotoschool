package com.ggs.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_has_permission", schema = "", catalog = "gotoschool")
@IdClass(UserHasPermissionPK.class)
public class UserHasPermission {
    private int userid;
    private int permissionId;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "PermissionID")
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasPermission that = (UserHasPermission) o;

        if (userid != that.userid) return false;
        if (permissionId != that.permissionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + permissionId;
        return result;
    }
}
