package com.imooc.luckymoney;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {
   @Autowired
   private Limitconfig limitconfig;
    @GetMapping("/hello")
    public  String Say(){
        return "springboot!"+",说明:"+limitconfig.getDescription();
    }

}
