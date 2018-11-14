package com.et.dubbo.controller;

import com.et.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Think
 * @create 2018-09-12 11:32
 */
@Controller
@RequestMapping("testController")
public class TestController {

    @Autowired
    private TestService testService;


    public String getName(String name) {
        String data = testService.getData(name);
        return data;
    }
}
