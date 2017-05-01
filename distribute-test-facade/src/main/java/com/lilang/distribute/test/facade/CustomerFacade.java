package com.lilang.distribute.test.facade;

import com.lilang.distribute.test.facade.res.CustomerInfoRes;

import javax.jws.WebService;

/**
 * Created by lilang on 17/1/5.
 */

@WebService
public interface CustomerFacade {

    CustomerInfoRes queryCustomerInfoById(String customerId);

    String buySomething(String name, String traceLogId);
}
