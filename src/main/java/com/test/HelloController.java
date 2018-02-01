package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/20 9:52
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World,hehehe";
    }
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User(5L,"李四",18,new Date(),"这是备注信息");
        return user;
    }
    @RequestMapping("/getMap")
    public Map<Integer,User> getMap(){

        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1,new User(5L,"张三",18,new Date(),"这是备注信息111"));
        userMap.put(2,new User(6L,"李四",23,new Date(),"这是备注信息222"));
        userMap.put(3,new User(7L,"王五",11,new Date(),"这是备注信息333"));
        userMap.put(4,new User(8L,"赵六",35,new Date(),"这是备注信息444"));
        return userMap;
    }
}
