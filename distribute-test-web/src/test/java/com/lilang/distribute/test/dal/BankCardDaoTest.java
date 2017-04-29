package com.lilang.distribute.test.dal;

import com.lilang.distribute.test.dal.dao.BankCardDao;
import com.lilang.distribute.test.dal.model.BankCardDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilang on 17/4/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
public class BankCardDaoTest {

    @Autowired
    BankCardDao bankCardDao;

    @Test
    public void testInsertSelective() throws ParseException {
        BankCardDO bankCardDO = new BankCardDO();
        bankCardDO.setCardId((int) System.currentTimeMillis());
        bankCardDO.setBankShort("CCB");
        bankCardDO.setBelongArea("shanghai");
        bankCardDO.setCardIndex("fhda82hfhasi87r38qfsaufas");
        bankCardDO.setCardType("D");
        bankCardDO.setBelongName("lilang");
        bankCardDO.setReserveTel("18888888888");
        bankCardDO.setCardBin("626**************4626");
        bankCardDO.setCustomerId("123456");
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = format.parse("20200920");
        bankCardDO.setExpireDate(date);
        bankCardDO.setStatus("T");
        bankCardDO.setCreateTime(new Date());
        bankCardDO.setUpdateTime(new Date());
        bankCardDao.insertSelective(bankCardDO);

    }

    @Test
    public void testSelect(){
        bankCardDao.selectByPrimaryKey(12);
    }
}
