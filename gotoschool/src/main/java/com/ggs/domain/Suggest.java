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
public class Suggest {
    private int suggestid;
    private String integralDesc;
    private String content;
    private Date createTm;
    private String telephone;

    @Id
    @Column(name = "suggestid")
    public int getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(int suggestid) {
        this.suggestid = suggestid;
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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Suggest suggest = (Suggest) o;

        if (suggestid != suggest.suggestid) return false;
        if (integralDesc != null ? !integralDesc.equals(suggest.integralDesc) : suggest.integralDesc != null)
            return false;
        if (content != null ? !content.equals(suggest.content) : suggest.content != null) return false;
        if (createTm != null ? !createTm.equals(suggest.createTm) : suggest.createTm != null) return false;
        if (telephone != null ? !telephone.equals(suggest.telephone) : suggest.telephone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = suggestid;
        result = 31 * result + (integralDesc != null ? integralDesc.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        return result;
    }
}
