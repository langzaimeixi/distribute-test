package com.lilang.distribute.test.facade;

import com.lilang.distribute.test.facade.res.AuthInfoRes;

import javax.jws.WebService;

/**
 * Created by lilang on 17/4/15.
 */
@WebService
public interface AuthFacade {
    AuthInfoRes queryAuthInfo(String param);
}
