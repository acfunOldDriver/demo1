package com.lba.demo.general.service

import com.lba.demo.general.dao.HelloDao
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class HelloService {

    @Autowired
    HelloDao helloDao

    String sayHello(String helloWrod){
        return helloWrod
    }

    String findUserName(String userName){
        return helloDao.findById(1)
    }
}
