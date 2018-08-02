package com.dsq.service;

import org.springframework.stereotype.Component;

/**
 * Created by DELL on 2018/8/2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}