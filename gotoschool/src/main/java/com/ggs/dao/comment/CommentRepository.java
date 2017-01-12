package com.ggs.dao.comment;

import com.ggs.domain.Comment;
import com.ggs.domain.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
