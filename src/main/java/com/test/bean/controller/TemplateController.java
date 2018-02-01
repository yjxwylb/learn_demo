package com.test.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/21 10:30
 */
@Controller
@RequestMapping("/test")
public class TemplateController {
    @RequestMapping("/thymeleaf")
    public String hello(Map<String, Object> map) {
       // model.addAttribute("id","123445");

        map.put("name","张三");
        map.put("id",getID());
        return "hello";
    }
    @ModelAttribute("getId")
    private String getID(){
        return "11111";
    }

    @RequestMapping("/freemarker")
    public String freemarkerTest(Map<String, Object> map){
        map.put("name","zhangsan");
        return "helloFtl";
    }
}
