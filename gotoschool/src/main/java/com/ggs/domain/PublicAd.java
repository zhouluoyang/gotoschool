package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "public_ad", schema = "", catalog = "gotoschool")
public class PublicAd {
    private int adid;
    private String adname;
    private Date createTm;
    private String description;

    @Id
    @Column(name = "adid")
    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    @Basic
    @Column(name = "adname")
    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
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
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicAd publicAd = (PublicAd) o;

        if (adid != publicAd.adid) return false;
        if (adname != null ? !adname.equals(publicAd.adname) : publicAd.adname != null) return false;
        if (createTm != null ? !createTm.equals(publicAd.createTm) : publicAd.createTm != null) return false;
        if (description != null ? !description.equals(publicAd.description) : publicAd.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adid;
        result = 31 * result + (adname != null ? adname.hashCode() : 0);
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
