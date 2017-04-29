package com.lilang.distribute.test.facade.res;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lilang on 17/4/29.
 */
@Getter
@Setter
@ToString
public class CustomerInfoRes extends AbstractRes {

    private String customerId;
    private String customerName;
    private String regAccount;
    private String phoneNo;
    private String identityNo;
    private String identityType;
    private String loginName;
    private String loginPassword;

}
