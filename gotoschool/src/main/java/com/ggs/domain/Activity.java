package com.ggs.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
public class Activity {
    private int activityid;
    private String title;
    private String content;
    private Date begintime;
    private Date endtime;
    private String address;
    private String talker;
    private int likeNm;
    private int collectNm;
    private int activXtype;
    private int activStype;
    private int activStatu;

    @Id
    @Column(name = "activityid")
    public int getActivityid() {
        return activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "begintime")
    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    @Basic
    @Column(name = "endtime")
    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "talker")
    public String getTalker() {
        return talker;
    }

    public void setTalker(String talker) {
        this.talker = talker;
    }

    @Basic
    @Column(name = "like_nm")
    public int getLikeNm() {
        return likeNm;
    }

    public void setLikeNm(int likeNm) {
        this.likeNm = likeNm;
    }

    @Basic
    @Column(name = "collect_nm")
    public int getCollectNm() {
        return collectNm;
    }

    public void setCollectNm(int collectNm) {
        this.collectNm = collectNm;
    }

    @Basic
    @Column(name = "activ_xtype")
    public int getActivXtype() {
        return activXtype;
    }

    public void setActivXtype(int activXtype) {
        this.activXtype = activXtype;
    }

    @Basic
    @Column(name = "activ_stype")
    public int getActivStype() {
        return activStype;
    }

    public void setActivStype(int activStype) {
        this.activStype = activStype;
    }

    @Basic
    @Column(name = "activ_statu")
    public int getActivStatu() {
        return activStatu;
    }

    public void setActivStatu(int activStatu) {
        this.activStatu = activStatu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (activityid != activity.activityid) return false;
        if (likeNm != activity.likeNm) return false;
        if (collectNm != activity.collectNm) return false;
        if (activXtype != activity.activXtype) return false;
        if (activStype != activity.activStype) return false;
        if (activStatu != activity.activStatu) return false;
        if (title != null ? !title.equals(activity.title) : activity.title != null) return false;
        if (content != null ? !content.equals(activity.content) : activity.content != null) return false;
        if (begintime != null ? !begintime.equals(activity.begintime) : activity.begintime != null) return false;
        if (endtime != null ? !endtime.equals(activity.endtime) : activity.endtime != null) return false;
        if (address != null ? !address.equals(activity.address) : activity.address != null) return false;
        if (talker != null ? !talker.equals(activity.talker) : activity.talker != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (begintime != null ? begintime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (talker != null ? talker.hashCode() : 0);
        result = 31 * result + likeNm;
        result = 31 * result + collectNm;
        result = 31 * result + activXtype;
        result = 31 * result + activStype;
        result = 31 * result + activStatu;
        return result;
    }
}
