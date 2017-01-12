package com.ggs.dao.suggest;

import com.ggs.domain.PublicAd;
import com.ggs.domain.Suggest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface SuggestRepository extends JpaRepository<Suggest,Integer> {

}
