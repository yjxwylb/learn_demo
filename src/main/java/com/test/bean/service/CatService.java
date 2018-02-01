package com.test.bean.service;

import com.test.bean.entity.Cat;
import com.test.bean.repository.Cat2Repository;
import com.test.bean.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author XYJ
 * @Description:对于增删改,需要使用事物
 * @Date:Created in 2017/12/20 16:18
 */
@Service
public class CatService {
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;

    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    @Transactional
    public void delete(Integer id) {
        catRepository.delete(id);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }
}
