package com.ggs.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_like_comment", schema = "", catalog = "gotoschool")
@IdClass(UserLikeCommentPK.class)
public class UserLikeComment {
    private int userid;
    private int comUserid;
    private int activityid;
    private int commentid;
    private String createTm;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "com_userid")
    public int getComUserid() {
        return comUserid;
    }

    public void setComUserid(int comUserid) {
        this.comUserid = comUserid;
    }

    @Id
    @Column(name = "activityid")
    public int getActivityid() {
        return activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    @Id
    @Column(name = "commentid")
    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    @Id
    @Column(name = "create_tm")
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

        UserLikeComment that = (UserLikeComment) o;

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
