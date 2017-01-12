package com.ggs.dao.userLikeComment;

import com.ggs.domain.PublicAd;
import com.ggs.domain.UserLikeComment;
import com.ggs.domain.UserLikeCommentPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserLikeCommentRepository extends JpaRepository<UserLikeComment,UserLikeCommentPK> {

}
