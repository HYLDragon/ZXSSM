package com.zx.mes.test;

import com.alibaba.fastjson.JSON;
import com.zx.mes.dao.admin.ResourceMapper;
import com.zx.mes.model.admin.Resource;
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
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestResource {
    private static final Logger logger=Logger.getLogger(TestResource.class);
    @Autowired
    private ResourceMapper resourceMapper;
    @Test
    public void test(){
        Resource resource=new Resource();

        resource.setName("%表格");

        logger.info(JSON.toJSONStringWithDateFormat(resourceMapper.getAll(resource),""));
    }
}
