package com.lilang.distribute.test.facade;

import com.lilang.distribute.test.facade.req.BankcardInfoReq;
import com.lilang.distribute.test.facade.res.BankcardInfoRes;

/**
 * Created by lilang on 17/4/15.
 */
public interface BankcardFacade {

    BankcardInfoRes queryBankcardInfo(BankcardInfoReq req);
}
