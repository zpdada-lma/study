package com.et.dubbo.service;

import org.springframework.stereotype.Service;

/**
 * @author Think
 * @create 2018-09-12 12:02
 */

@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public String getData(String name) {
        return "result is " + name;
    }
}
