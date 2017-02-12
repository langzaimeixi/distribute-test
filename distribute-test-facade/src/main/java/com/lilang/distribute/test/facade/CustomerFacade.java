package com.lilang.distribute.test.facade;

import javax.jws.WebService;

/**
 * Created by lilang on 17/1/5.
 */

@WebService
public interface CustomerFacade {

    String buySomething(String name);
}
