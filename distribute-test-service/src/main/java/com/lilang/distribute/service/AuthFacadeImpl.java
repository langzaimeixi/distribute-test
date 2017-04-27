package com.lilang.distribute.service;

import com.lilang.distribute.test.facade.AuthFacade;
import com.lilang.distribute.test.facade.res.AuthInfoRes;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/4/27.
 */
@Component("authFacadeBean")
public class AuthFacadeImpl implements AuthFacade {
    public AuthInfoRes queryAuthInfo(String param) {
        return null;
    }
}
