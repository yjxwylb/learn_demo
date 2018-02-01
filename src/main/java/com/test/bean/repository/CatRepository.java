package com.test.bean.repository;

import com.test.bean.entity.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by XYJ on 2017/12/20.
 */
public interface CatRepository extends CrudRepository<Cat,Integer > {

}
