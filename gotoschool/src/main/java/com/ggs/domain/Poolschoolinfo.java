package com.ggs.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
public class Poolschoolinfo {
    private int schoolid;
    private String schoolAddr;
    private String schoolIntro;
    private String schoolImgAddr;

    @Id
    @Column(name = "schoolid")
    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    @Basic
    @Column(name = "school_addr")
    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    @Basic
    @Column(name = "school_intro")
    public String getSchoolIntro() {
        return schoolIntro;
    }

    public void setSchoolIntro(String schoolIntro) {
        this.schoolIntro = schoolIntro;
    }

    @Basic
    @Column(name = "school_img_addr")
    public String getSchoolImgAddr() {
        return schoolImgAddr;
    }

    public void setSchoolImgAddr(String schoolImgAddr) {
        this.schoolImgAddr = schoolImgAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poolschoolinfo that = (Poolschoolinfo) o;

        if (schoolid != that.schoolid) return false;
        if (schoolAddr != null ? !schoolAddr.equals(that.schoolAddr) : that.schoolAddr != null) return false;
        if (schoolIntro != null ? !schoolIntro.equals(that.schoolIntro) : that.schoolIntro != null) return false;
        if (schoolImgAddr != null ? !schoolImgAddr.equals(that.schoolImgAddr) : that.schoolImgAddr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolid;
        result = 31 * result + (schoolAddr != null ? schoolAddr.hashCode() : 0);
        result = 31 * result + (schoolIntro != null ? schoolIntro.hashCode() : 0);
        result = 31 * result + (schoolImgAddr != null ? schoolImgAddr.hashCode() : 0);
        return result;
    }
}
