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
public class Comment {
    private int commentid;
    private int level;
    private String content;
    private Integer pCommentid;
    private Date createTm;

    @Id
    @Column(name = "commentid")
    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    @Basic
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
    @Column(name = "p_commentid")
    public Integer getpCommentid() {
        return pCommentid;
    }

    public void setpCommentid(Integer pCommentid) {
        this.pCommentid = pCommentid;
    }

    @Basic
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

        Comment comment = (Comment) o;

        if (commentid != comment.commentid) return false;
        if (level != comment.level) return false;
        if (content != null ? !content.equals(comment.content) : comment.content != null) return false;
        if (pCommentid != null ? !pCommentid.equals(comment.pCommentid) : comment.pCommentid != null) return false;
        if (createTm != null ? !createTm.equals(comment.createTm) : comment.createTm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentid;
        result = 31 * result + level;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (pCommentid != null ? pCommentid.hashCode() : 0);
        result = 31 * result + (createTm != null ? createTm.hashCode() : 0);
        return result;
    }
}
