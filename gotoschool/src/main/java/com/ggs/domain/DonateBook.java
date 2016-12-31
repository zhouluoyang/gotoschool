package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "donate_book", schema = "", catalog = "gotoschool")
@IdClass(DonateBookPK.class)
public class DonateBook {
    private int schoolid;
    private int bookid;
    private int userid;
    private int donateperid;
    private Date createTb;

    @Id
    @Column(name = "schoolid")
    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    @Id
    @Column(name = "bookid")
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "donateperid")
    public int getDonateperid() {
        return donateperid;
    }

    public void setDonateperid(int donateperid) {
        this.donateperid = donateperid;
    }

    @Basic
    @Column(name = "create_tb")
    public Date getCreateTb() {
        return createTb;
    }

    public void setCreateTb(Date createTb) {
        this.createTb = createTb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonateBook that = (DonateBook) o;

        if (schoolid != that.schoolid) return false;
        if (bookid != that.bookid) return false;
        if (userid != that.userid) return false;
        if (donateperid != that.donateperid) return false;
        if (createTb != null ? !createTb.equals(that.createTb) : that.createTb != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolid;
        result = 31 * result + bookid;
        result = 31 * result + userid;
        result = 31 * result + donateperid;
        result = 31 * result + (createTb != null ? createTb.hashCode() : 0);
        return result;
    }
}
