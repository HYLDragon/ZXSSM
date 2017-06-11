package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import com.zx.mes.dao.admin.RoleMapper;
import com.zx.mes.model.admin.Role;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Created by hyl on 17/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestRole {
    private static final Logger logger=Logger.getLogger(TestRole.class);
//    test
    @Autowired
    private RoleMapper roleMapper;
    @Test
    public void test(){
        Role role=roleMapper.selectByPrimaryKey("0");
        logger.info(JSON.toJSONStringWithDateFormat(role,"yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void test1(){

        Role role=new Role();

        role.setName("%员%");

        logger.info(JSON.toJSONStringWithDateFormat(roleMapper.getCount(role),"yyyy-MM-dd HH:mm:ss"));

        logger.info(JSON.toJSONStringWithDateFormat(roleMapper.getAll(role),"yyyy-MM-dd HH:mm:ss"));

        logger.info(JSON.toJSONStringWithDateFormat(roleMapper.getAllWithRource(role),"yyyy-MM-dd HH:mm:ss"));
    }
}
