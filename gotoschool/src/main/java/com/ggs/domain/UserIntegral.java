package com.ggs.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "user_integral", schema = "", catalog = "gotoschool")
@IdClass(UserIntegralPK.class)
public class UserIntegral {
    private int userid;
    private int integralid;
    private Date createTm;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "integralid")
    public int getIntegralid() {
        return integralid;
    }

    public void setIntegralid(int integralid) {
        this.integralid = integralid;
    }

    @Id
    @Column(name = "create_tm")
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

        UserIntegral that = (UserIntegral) o;

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
