package com.lba.demo1.controller

import com.lba.demo1.service.HelloService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CompileStatic
@RestController
@RequestMapping("/hello")
class HelloController {

    @Autowired
    HelloService helloService

    @RequestMapping(value = "sayHello")
    @ResponseBody
    String hello(String helloWord) {
        String realWord
        if(helloWord!=null){
            realWord = helloWord
        }else{
            realWord = "你好"
        }
        return helloService.sayHello(realWord)
    }
}
