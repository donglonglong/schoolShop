package com.imooc.o2o.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration

public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name ="dlk";
        Integer price =66666;
        logger.info("name:"+name +"  "+"余额："+price);
        logger.info("info....111111111111111111");
        logger.debug("debug...22222222222222222222");
        logger.error("error...33333333333333333333333" );
    }
}
