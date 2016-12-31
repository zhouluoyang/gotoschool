package com.ggs.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2016-12-31.
 */
public class DonateBookPK implements Serializable {
    private int schoolid;

    @Column(name = "schoolid")
    @Id
    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    private int bookid;

    @Column(name = "bookid")
    @Id
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    private int userid;

    @Column(name = "userid")
    @Id
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private int donateperid;

    @Column(name = "donateperid")
    @Id
    public int getDonateperid() {
        return donateperid;
    }

    public void setDonateperid(int donateperid) {
        this.donateperid = donateperid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonateBookPK that = (DonateBookPK) o;

        if (schoolid != that.schoolid) return false;
        if (bookid != that.bookid) return false;
        if (userid != that.userid) return false;
        if (donateperid != that.donateperid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolid;
        result = 31 * result + bookid;
        result = 31 * result + userid;
        result = 31 * result + donateperid;
        return result;
    }
}
