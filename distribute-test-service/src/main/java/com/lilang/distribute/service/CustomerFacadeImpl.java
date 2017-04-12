package com.lilang.distribute.service;

import com.lilang.distribute.test.facade.CustomerFacade;
import org.apache.cxf.common.util.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/1/5.
 */
@Component("customerFacadeBean")
public class CustomerFacadeImpl implements CustomerFacade {
    public String buySomething(String name) {
        System.out.println("hello world " + name);
        String result = null;
        if ("123".equals(name)) {
            result = "S";
        }
        return result;

    }
}
