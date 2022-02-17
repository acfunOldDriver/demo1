package com.lba.demo.util

import com.alibaba.druid.pool.DruidDataSource
import com.alibaba.druid.pool.DruidPooledConnection
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import java.sql.SQLException;

@Configuration
class DataSourceConfig {

    /**
     * 获取配置
     * @return
     */
    @Bean
    DruidDataSource dataSource(){
        return DruidDataSourceBuilder.create().build()
    }

    /**
     * 获取链接
     * @return
     * @throws SQLException
     */
    DruidPooledConnection getConnection() throws SQLException{
        return dataSource().getConnection()
    }
}
