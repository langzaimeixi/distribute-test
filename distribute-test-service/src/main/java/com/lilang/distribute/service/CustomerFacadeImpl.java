package com.lilang.distribute.service;

import com.lilang.distribute.test.facade.CustomerFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/1/5.
 */
@Slf4j
@Component("customerFacadeBean")
public class CustomerFacadeImpl implements CustomerFacade {
    public String buySomething(String name) {
        log.info("begin CustomerFacadeImpl#buySomething, name={}", name);
        String result = null;
        if ("123".equals(name)) {
            result = "S";
        }
        log.info("end CustomerFacadeImpl#buySomething, result={}", result);
        return result;

    }
}
