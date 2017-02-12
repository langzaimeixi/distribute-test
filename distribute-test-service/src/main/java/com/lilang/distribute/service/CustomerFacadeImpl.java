package com.lilang.distribute.service;

import com.lilang.distribute.test.facade.CustomerFacade;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/1/5.
 */
@Component("customerFacadeBean")
public class CustomerFacadeImpl implements CustomerFacade {
    public String buySomething(String name) {
        System.out.println("hello world");
        return "buy " + name + " success";
    }
}
