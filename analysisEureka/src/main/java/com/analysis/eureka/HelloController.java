package com.analysis.eureka;


import org.springframework.web.bind.annotation.*;


/**
 * @Auther: zt
 * @Date: 2020/03/19
 * @Description:demand module
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/sayHello")
    @ResponseBody
    public Object sayHello(){
        return "hello 22222";
    }



}
