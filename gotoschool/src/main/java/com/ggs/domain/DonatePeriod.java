package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "donate_period", schema = "", catalog = "gotoschool")
public class DonatePeriod {
    private int donateperid;
    private String name;
    private Date beginTm;
    private Date endTm;

    @Id
    @Column(name = "donateperid")
    public int getDonateperid() {
        return donateperid;
    }

    public void setDonateperid(int donateperid) {
        this.donateperid = donateperid;
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
    @Column(name = "begin_tm")
    public Date getBeginTm() {
        return beginTm;
    }

    public void setBeginTm(Date beginTm) {
        this.beginTm = beginTm;
    }

    @Basic
    @Column(name = "end_tm")
    public Date getEndTm() {
        return endTm;
    }

    public void setEndTm(Date endTm) {
        this.endTm = endTm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonatePeriod that = (DonatePeriod) o;

        if (donateperid != that.donateperid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (beginTm != null ? !beginTm.equals(that.beginTm) : that.beginTm != null) return false;
        if (endTm != null ? !endTm.equals(that.endTm) : that.endTm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = donateperid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (beginTm != null ? beginTm.hashCode() : 0);
        result = 31 * result + (endTm != null ? endTm.hashCode() : 0);
        return result;
    }
}
