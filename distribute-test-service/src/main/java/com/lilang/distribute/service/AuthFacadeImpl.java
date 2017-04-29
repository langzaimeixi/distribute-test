package com.lilang.distribute.service;

import com.lilang.distribute.service.converter.AuthConverter;
import com.lilang.distribute.service.util.BeanCopyUtil;
import com.lilang.distribute.test.dal.dao.AuthDao;
import com.lilang.distribute.test.dal.model.AuthDO;
import com.lilang.distribute.test.facade.AuthFacade;
import com.lilang.distribute.test.facade.res.AuthInfoRes;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lilang on 17/4/27.
 */
@Slf4j
@Component("authFacadeBean")
public class AuthFacadeImpl implements AuthFacade {
    @Autowired
    private AuthDao authDao;
    public AuthInfoRes queryAuthInfo(int param) {
        AuthInfoRes res = new AuthInfoRes();
        log.info("begin AuthFacadeImpl.queryAuthInfo, param:{}", param);
        AuthDO authDO = authDao.selectByPrimaryKey(param);
        BeanCopyUtil.beanCopy(authDO, res, AuthInfoRes.class);
        log.info("end AuthFacadeImpl.queryAuthInfo, res:{}", res);
        return res;
    }
}
