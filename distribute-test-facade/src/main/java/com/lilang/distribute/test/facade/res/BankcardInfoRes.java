package com.lilang.distribute.test.facade.res;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by lilang on 17/4/27.
 */
@Getter
@Setter
@ToString
public class BankcardInfoRes extends AbstractRes {
    private String carId;
    private String cardType;
    private String bankShort;
    private String cardIndex;
    private String cardBin;
    private String customerId;
    private String belongArea;
    private String reserveTel;
    private String belongName;
    private Date expireDate;
    private String status;
}
