package com.art.artweb;

import org.springframework.web.bind.annotation.*;

/**
 * @author dibulidohu
 * @classname TestController
 * @date 2019/3/610:41
 * @description
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @PostMapping(value = "ok")
    public String test() {
        return "ok";
    }

    @GetMapping(value = "hi")
    public String hi() {
        return "hi";
    }
}
