package com.ggs.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2016-12-31.
 */
public class UserLikeCommentPK implements Serializable {
    private int userid;

    @Column(name = "userid")
    @Id
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private int comUserid;

    @Column(name = "com_userid")
    @Id
    public int getComUserid() {
        return comUserid;
    }

    public void setComUserid(int comUserid) {
        this.comUserid = comUserid;
    }

    private int activityid;

    @Column(name = "activityid")
    @Id
    public int getActivityid() {
        return activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    private int commentid;

    @Column(name = "commentid")
    @Id
    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    private String createTm;

    @Column(name = "create_tm")
    @Id
    public String getCreateTm() {
        return createTm;
    }

    public void setCreateTm(String createTm) {
        this.createTm = createTm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLikeCommentPK that = (UserLikeCommentPK) o;

        if (userid != that.userid) return false;
        if (comUserid != that.comUserid) return false;
        if (activityid != that.activityid) return false;
        if (commentid != that.commentid) return false;
        if (createTm != null ? !createTm.equals(that.createTm) : that.createTm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + comUserid;
        result = 31 * result + activityid;
        result = 31 * result + commentid;
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        return result;
    }
}
