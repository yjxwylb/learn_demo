package com.test;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author XYJ
 * @Description:
 * @Date:Created in 2017/12/20 9:54
 */
@Data
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //@JSONField(serialize = false)
    private String remark;

    public User() {

    }

    public User(Long id, String name, Integer age, Date createTime, String remark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.createTime = createTime;
        this.remark = remark;
    }
}
