package com.test.bean.repository;

import com.test.bean.entity.Cat;
import org.springframework.data.repository.Repository;

/**
 * Created by XYJ on 2017/12/21.
 */
public interface Cat2Repository extends Repository<Cat,Integer>{
    public Cat findByCatName(String catName);
}
