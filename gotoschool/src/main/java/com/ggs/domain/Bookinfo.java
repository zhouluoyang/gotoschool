package com.ggs.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016-12-31.
 */
@Entity
public class Bookinfo {
    private int bookid;
    private String bookName;
    private int price;
    private String supplierName;
    private String pictureAddr;
    private String author;
    private String publicationYear;

    @Id
    @Column(name = "bookid")
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    @Basic
    @Column(name = "book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "supplier_name")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "picture_addr")
    public String getPictureAddr() {
        return pictureAddr;
    }

    public void setPictureAddr(String pictureAddr) {
        this.pictureAddr = pictureAddr;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "publication_year")
    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bookinfo bookinfo = (Bookinfo) o;

        if (bookid != bookinfo.bookid) return false;
        if (price != bookinfo.price) return false;
        if (bookName != null ? !bookName.equals(bookinfo.bookName) : bookinfo.bookName != null) return false;
        if (supplierName != null ? !supplierName.equals(bookinfo.supplierName) : bookinfo.supplierName != null)
            return false;
        if (pictureAddr != null ? !pictureAddr.equals(bookinfo.pictureAddr) : bookinfo.pictureAddr != null)
            return false;
        if (author != null ? !author.equals(bookinfo.author) : bookinfo.author != null) return false;
        if (publicationYear != null ? !publicationYear.equals(bookinfo.publicationYear) : bookinfo.publicationYear != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookid;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (pictureAddr != null ? pictureAddr.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publicationYear != null ? publicationYear.hashCode() : 0);
        return result;
    }
}
