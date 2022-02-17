package com.lba.demo.general.service

import com.alibaba.druid.pool.DruidPooledConnection
import com.lba.demo.util.DataSourceConfig
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

@CompileStatic
@Service
class HelloService {

    @Autowired
    DataSourceConfig dataSourceConfig

    String sayHello(String helloWrod){
        return helloWrod
    }

    String findUserName(String userName){
        DruidPooledConnection con = null
        String sql ="select * from user "
        String result
        try {
            con = dataSourceConfig.getConnection()
            PreparedStatement preparedStatement = con.prepareStatement(sql)
            ResultSet resultSet = preparedStatement.executeQuery()
            while (resultSet.next()){
                int a = resultSet.getInt(0)
            }
        } catch (SQLException e){
            e.printStackTrace()
            result = e.toString()
        } finally {
            if(con!=null){
                try {
                    con.close()
                } catch (SQLException e){
                    e.printStackTrace()
                    result = e.toString()
                }
            }
            return result
        }
    }
}
