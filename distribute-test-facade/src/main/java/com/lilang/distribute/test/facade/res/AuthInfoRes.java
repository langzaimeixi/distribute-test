package com.lilang.distribute.test.facade.res;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lilang on 17/4/27.
 */
@Getter
@Setter
@ToString
public class AuthInfoRes extends AbstractRes {
    private int id;
    private String authType;
    private String customerId;
    private String customerName;
    private String status;
    private String authEntityNo;
}
