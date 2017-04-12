package com.lilang.distribute.service;

import com.lilang.distribute.service.model.TradeResponse;
import com.lilang.distribute.test.facade.CustomerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lilang on 17/2/12.
 */
@Controller
public class TradeServiceImpl implements TradeService {

    @Autowired
    private CustomerFacade customerFacade;

    @ResponseBody
    @RequestMapping("/trade")
    public TradeResponse tradeGood(String id) {
        String s = customerFacade.buySomething(id);
        TradeResponse response = new TradeResponse();
        if ("S".equals(s)) {
            response.setCode("000000");
            response.setMsg("success");
        } else {
            response.setCode("999999");
            response.setMsg("failed");
        }
        return response;
    }
}
