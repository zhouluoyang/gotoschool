package com.ggs.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
@Table(name = "class_date", schema = "", catalog = "gotoschool")
public class ClassDate {
    private int classdataid;
    private String classdataAddr;
    private int price;

    @Id
    @Column(name = "classdataid")
    public int getClassdataid() {
        return classdataid;
    }

    public void setClassdataid(int classdataid) {
        this.classdataid = classdataid;
    }

    @Basic
    @Column(name = "classdata_addr")
    public String getClassdataAddr() {
        return classdataAddr;
    }

    public void setClassdataAddr(String classdataAddr) {
        this.classdataAddr = classdataAddr;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassDate classDate = (ClassDate) o;

        if (classdataid != classDate.classdataid) return false;
        if (price != classDate.price) return false;
        if (classdataAddr != null ? !classdataAddr.equals(classDate.classdataAddr) : classDate.classdataAddr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classdataid;
        result = 31 * result + (classdataAddr != null ? classdataAddr.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
