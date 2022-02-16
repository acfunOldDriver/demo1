package com.lba.demo.general.controller

import com.lba.demo.general.service.HelloService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("hello")
class HelloController {

    @Autowired
    HelloService helloService

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    String hello(String helloWord) {
        String realWord
        if(helloWord!=null){
            realWord = helloWord
        }else{
            realWord = "你好"
        }
        return helloService.sayHello(realWord)
    }

    @RequestMapping(value = "findUserName", method = RequestMethod.GET)
    String findUserName(String userName) {
        return helloService.findUserName(userName)
    }
}
