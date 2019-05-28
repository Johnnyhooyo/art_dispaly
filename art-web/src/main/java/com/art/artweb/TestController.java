package com.art.artweb;

import com.art.artservice.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Autowired
    IDemoService demoService;

    @PostMapping(value = "ok")
    public String test() {
        return "ok";
    }

    @GetMapping(value = "hi")
    public String hi() {
        return "hi" + demoService.demo();
    }
}
