package com.mcf.springboot.controller;

import com.mcf.springboot.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by admin on 2017/2/12.
 */
@RestController
public class McfController {

    @RequestMapping("/index")
    public String index() {
        return "爱你一万..。";
    }

    @RequestMapping("/person")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Tom");
        p.setAge(20);
        p.setBirthday(new Date());
        return p;
    }
}
