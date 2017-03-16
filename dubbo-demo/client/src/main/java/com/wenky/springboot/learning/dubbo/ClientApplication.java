package com.wenky.springboot.learning.dubbo;

import com.wenky.springboot.learning.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ZhongWenjian on 2017/3/16.
 */
@SpringBootApplication
@ImportResource("dubbo.xml")
@RestController
public class ClientApplication {
    @Autowired
    private DemoService demoService;
    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class,args);
    }
    @RequestMapping("/")
    public String index(){
        return demoService.saySomething("index");
    }
}
