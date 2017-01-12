package com.ggs.dao.donateBook;

import com.ggs.domain.DonateBook;
import com.ggs.domain.DonateBookPK;
import com.ggs.domain.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface DonateBookRepository extends JpaRepository<DonateBook,DonateBookPK> {

}
