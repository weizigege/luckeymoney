package com.imooc.luckymoney;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloController2 {
    @Autowired
    private Limitconfig limitconfig;
    @GetMapping("/hello1/{id}")
    public  String Say(@PathVariable("id") Integer id){
        return "id:"+id;
    }

}
