package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: luckymoney
 * @description
 * @author: hu
 * @create: 2020-02-11 12:45
 **/

public interface LuckeymoneyRepository extends JpaRepository<Luckeymoney,Integer> {


}
