package com.imooc.luckymoney;

import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * springboot learn
 * @program: luckymoney
 * @description
 * @author: hu
 * @create: 2020-02-11 12:43
 **/
@RestController
public class LuckeymoneyController {
    @Autowired
    private LuckeymoneyRepository repository;

    @GetMapping("/luckeymoneys")
    public List<Luckeymoney> list() {

        return repository.findAll();

    }

    @PostMapping("/luckeymoney")
    public Luckeymoney create(@RequestParam("producer") String producer,
                              @RequestParam("money") BigDecimal money) {

        Luckeymoney luckeymoney = new Luckeymoney();
        luckeymoney.setProducer(producer);
        luckeymoney.setMoney(money);
        return repository.save(luckeymoney);
    }

    @GetMapping("/luckeymoney/{id}")
    public Luckeymoney findbyId(@PathVariable("id") Integer id) {

        return repository.findById(id).orElse(null);

    }

    @PutMapping("/luckeymoney/{id}")
    public Luckeymoney update(@PathVariable("id") Integer id,
                    @RequestParam("consumer") String consumer) {

                Optional<Luckeymoney> optional = repository.findById(id);
                if(optional.isPresent()){
                    Luckeymoney luckeymoney = optional.get();
                    luckeymoney.setId(id);
            luckeymoney.setConsumer(consumer);
            return repository.save(luckeymoney);
        }
            return null;




    }


}
