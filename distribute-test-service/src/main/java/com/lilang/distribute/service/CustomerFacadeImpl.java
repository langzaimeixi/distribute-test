package com.lilang.distribute.service;

import com.lilang.distribute.aspect.annotation.TraceLog;
import com.lilang.distribute.service.util.BeanCopyUtil;
import com.lilang.distribute.test.dal.dao.CustomerDao;
import com.lilang.distribute.test.dal.model.CustomerDO;
import com.lilang.distribute.test.facade.CustomerFacade;
import com.lilang.distribute.test.facade.res.CustomerInfoRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/1/5.
 */
@Slf4j
@Component("customerFacadeBean")
public class CustomerFacadeImpl implements CustomerFacade {
    @Autowired
    private CustomerDao customerDao;
    public CustomerInfoRes queryCustomerInfoById(String customerId) {
        CustomerInfoRes res = new CustomerInfoRes();
        log.info("begin CustomerFacadeImpl.queryCustomerInfoById, customerId:{}", customerId);
        CustomerDO customerDO = customerDao.selectByPrimaryKey(Integer.valueOf(customerId));
        BeanCopyUtil.beanCopy(customerDO, res, CustomerInfoRes.class);
        log.info("end CustomerFacadeImpl.queryCustomerInfoById, result:{}", customerDO.toString());
        log.info("res={}",res.toString());
        return res;
    }

    public String buySomething(String name, @TraceLog("traceLogId") String traceLogId) {
        log.info("begin CustomerFacadeImpl#buySomething, name={}", name);
        String result = null;
        if ("123".equals(name)) {
            result = "S";
        }
        log.info("end CustomerFacadeImpl#buySomething, result={}", result);
        return result;
    }
}
