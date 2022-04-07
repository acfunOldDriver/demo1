package com.lba.demo.util

import com.alibaba.druid.pool.DruidDataSource
import com.alibaba.druid.pool.DruidPooledConnection
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException;

@Configuration
class DataUtil {

    @Autowired
    DataSourceConfig dataSourceConfig

    Map getResult(String sql){
        DruidPooledConnection con = null
        Map map = new HashMap()
        try{
            con = dataSourceConfig.getConnection()
            PreparedStatement preparedStatement = con.prepareStatement(sql)
            ResultSet resultSet = preparedStatement.executeQuery()
            if(resultSet!=null&&resultSet.first()){
                map.username = resultSet.getString("username")
                map.lastName = resultSet.getString("lastName")
                map.firstName = resultSet.getString("firstName")
                map.sex = resultSet.getInt("sex")
                map.phoneNo = resultSet.getString("phoneNo")
                map.email = resultSet.getString("email")
                map.password = resultSet.getString("password")
            }
            return map
        }catch (Exception e){
            e.printStackTrace()
            return map
        } finally {
            if(con!=null){
                con.close()
            }
        }
    }
}
