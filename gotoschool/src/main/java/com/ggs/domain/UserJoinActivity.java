package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_join_activity", schema = "", catalog = "gotoschool")
@IdClass(UserJoinActivityPK.class)
public class UserJoinActivity {
    private int userid;
    private int activityid;
    private String name;
    private String telephone;
    private Date createTm;
    private String qrCode;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "activityid")
    public int getActivityid() {
        return activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "create_tm")
    public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    @Basic
    @Column(name = "qr_code")
    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserJoinActivity that = (UserJoinActivity) o;

        if (userid != that.userid) return false;
        if (activityid != that.activityid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (createTm != null ? !createTm.equals(that.createTm) : that.createTm != null) return false;
        if (qrCode != null ? !qrCode.equals(that.qrCode) : that.qrCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + activityid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        result = 31 * result + (qrCode != null ? qrCode.hashCode() : 0);
        return result;
    }
}
