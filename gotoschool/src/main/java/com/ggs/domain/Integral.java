package com.ggs.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
public class Integral {
    private int integralid;
    private String integralDesc;
    private int integralNm;

    @Id
    @Column(name = "integralid")
    public int getIntegralid() {
        return integralid;
    }

    public void setIntegralid(int integralid) {
        this.integralid = integralid;
    }

    @Basic
    @Column(name = "integral_desc")
    public String getIntegralDesc() {
        return integralDesc;
    }

    public void setIntegralDesc(String integralDesc) {
        this.integralDesc = integralDesc;
    }

    @Basic
    @Column(name = "integral_nm")
    public int getIntegralNm() {
        return integralNm;
    }

    public void setIntegralNm(int integralNm) {
        this.integralNm = integralNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Integral integral = (Integral) o;

        if (integralid != integral.integralid) return false;
        if (integralNm != integral.integralNm) return false;
        if (integralDesc != null ? !integralDesc.equals(integral.integralDesc) : integral.integralDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = integralid;
        result = 31 * result + (integralDesc != null ? integralDesc.hashCode() : 0);
        result = 31 * result + integralNm;
        return result;
    }
}
