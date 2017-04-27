package com.lilang.distribute.test.facade.res;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by lilang on 17/4/27.
 */
@Getter
@Setter
@ToString
public class AbstractRes implements Serializable {
    private String resCode;
    private String resMsg;
}
