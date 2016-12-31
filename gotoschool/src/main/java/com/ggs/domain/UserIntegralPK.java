package com.ggs.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
public class UserIntegralPK implements Serializable {
    private int userid;
    private int integralid;
    private Date createTm;

    @Column(name = "userid")
    @Id
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Column(name = "integralid")
    @Id
    public int getIntegralid() {
        return integralid;
    }

    public void setIntegralid(int integralid) {
        this.integralid = integralid;
    }

    @Column(name = "create_tm")
    @Id
    public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserIntegralPK that = (UserIntegralPK) o;

        if (userid != that.userid) return false;
        if (integralid != that.integralid) return false;
        if (createTm != null ? !createTm.equals(that.createTm) : that.createTm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + integralid;
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        return result;
    }
}
