package com.art.artservice;

import org.springframework.stereotype.Service;

/**
 * @author dibulidohu
 * @classname DemoService
 * @date 2019/5/2814:00
 * @description demo
 */
@Service
public class DemoServiceImpl implements IDemoService{

    @Override
    public String demo() {
        return "demo response";
    }
}
