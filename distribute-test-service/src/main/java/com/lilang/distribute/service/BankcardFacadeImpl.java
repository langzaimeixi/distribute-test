package com.lilang.distribute.service;

import com.lilang.distribute.test.facade.BankcardFacade;
import com.lilang.distribute.test.facade.req.BankcardInfoReq;
import com.lilang.distribute.test.facade.res.BankcardInfoRes;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/4/27.
 */
@Component("bankcardFacadeBean")
public class BankcardFacadeImpl implements BankcardFacade {
    public BankcardInfoRes queryBankcardInfo(BankcardInfoReq req) {
        return null;
    }
}
