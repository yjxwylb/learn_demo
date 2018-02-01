package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/20 13:35
 */
@RestController
public class Hello2Controller {
    @RequestMapping("/hello222")
public String hello(){
    return "Hello hehehheehhe";
}
}
