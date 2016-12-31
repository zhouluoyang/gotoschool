package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_like_activity", schema = "", catalog = "gotoschool")
@IdClass(UserLikeActivityPK.class)
public class UserLikeActivity {
    private int userid;
    private int activityid;
    private Date likeTm;

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
    @Column(name = "like_tm")
    public Date getLikeTm() {
        return likeTm;
    }

    public void setLikeTm(Date likeTm) {
        this.likeTm = likeTm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLikeActivity that = (UserLikeActivity) o;

        if (userid != that.userid) return false;
        if (activityid != that.activityid) return false;
        if (likeTm != null ? !likeTm.equals(that.likeTm) : that.likeTm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + activityid;
        result = 31 * result + (likeTm != null ? likeTm.hashCode() : 0);
        return result;
    }
}
