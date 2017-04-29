package com.lilang.distribute.service.converter;

import com.lilang.distribute.test.dal.model.AuthDO;
import com.lilang.distribute.test.facade.res.AuthInfoRes;
import com.sun.xml.internal.ws.util.Pool;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by lilang on 17/4/29.
 */
public class AuthConverter {

    public static AuthInfoRes convertAuthDO2Res(AuthDO authDO) {

        AuthInfoRes res = new AuthInfoRes();
        return res;
    }
}
