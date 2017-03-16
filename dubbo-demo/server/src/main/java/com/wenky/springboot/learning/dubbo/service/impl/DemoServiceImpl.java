package com.wenky.springboot.learning.dubbo.service.impl;

import com.wenky.springboot.learning.dubbo.service.DemoService;
import org.springframework.stereotype.Service;


/**
 * Created by ZhongWenjian on 2017/3/15.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{
    public String saySomething(String something) {
        return "server say"+something==null?"":something;
    }
}
