package com.art.artweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dibulidohu
 * @classname TestController
 * @date 2019/3/610:41
 * @description
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "ok", method = {RequestMethod.POST})
    public String test() {
        return "ok";
    }

    @RequestMapping(value = "hi", method = {RequestMethod.GET})
    public String hi() {
        return "hi";
    }
}
