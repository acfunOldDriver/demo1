package com.lba.demo.general.service


import com.lba.demo.entity.user.UserDate
import com.lba.demo.util.DataUtil
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class HelloService extends BaseService<UserDate>{

    @Autowired
    DataUtil dataUtil

    String sayHello(String helloWrod){
        return helloWrod
    }

    String findUserName(String userName){
        String sql ="select * from user_data "
        UserDate userDate = new UserDate()
        try {
            Map map = dataUtil.getResult(sql)
            return map.toString()
        } catch (Exception e){
            e.printStackTrace()
            return e.message
        }
    }
}
