package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import com.zx.mes.dao.admin.BugMapper;
import com.zx.mes.dao.admin.BugTypeMapper;
import com.zx.mes.dao.admin.UserMapper;
import com.zx.mes.model.admin.Bug;
import com.zx.mes.model.admin.BugType;
import com.zx.mes.model.admin.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by hyl on 17/6/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

    private static final Logger logger = Logger.getLogger(TestMybatis.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BugTypeMapper bugTypeMapper;

    @Autowired
    private BugMapper bugMapper;

    @Test
    public void test() {
        System.out.println("junit");
        User u= userMapper.selectByPrimaryKey("0");
//        System.out.println(u.getName());
//        System.out.println();
        logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));

    }
    //模糊查询,
    @Test
    public void test2(){
        User u=new User();
        u.setName("admi%");
        List<User> list=userMapper.getAll(u);
        logger.info(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss"));

        logger.info(JSON.toJSONStringWithDateFormat(userMapper.getCount(u),"yyyy-MM-dd HH:mm:ss"));
    }
    //获取姓名的同时获取其角色
    @Test
    public void test3(){
        User u=new User();
        //u.setName("admi%");
        List<User> list=userMapper.getAllWithRole(u);
        logger.info(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss"));
    }
    @Test
    public void test4(){

        BugType bugType=new BugType();

        bugType.setName("错%");

        logger.info(JSON.toJSONStringWithDateFormat(bugTypeMapper.getAll(bugType),"yyyy-MM-dd HH:mm:ss"));
    }
    @Test
    public void test5(){
        Bug bug=new Bug();

        logger.info(JSON.toJSONStringWithDateFormat(bugMapper.getAll(bug),"yyyy-MM-dd HH:mm:ss"));
    }

}
