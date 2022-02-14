package com.lba.demo1.service

import groovy.transform.CompileStatic
import org.springframework.stereotype.Service

@CompileStatic
@Service
class HelloService {

    String sayHello(String helloWrod){
        return helloWrod
    }
}
