package com.test.bean.controller;

import com.test.bean.entity.Cat;
import com.test.bean.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/20 16:35
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save() {
        catService.save(new Cat("jack", 23));
        return "save OK!";
    }

    @RequestMapping("/delete")
    public String delete() {
        catService.delete(1);
        return "delete OK!";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();

    }
    @RequestMapping("/findByName")
    public Cat findCAt(@RequestParam String catName) {
        return catService.findByCatName(catName);

    }

}
