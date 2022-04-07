package com.lba.demo.entity.user

class UserDate {

    static DEFINE = [
            table   : 'user_data',
            idColumn: 'id',
            cache   : false,
            cacheKey: 'user_data',
            logHistory: false,
            autoIncrement: true
    ]

    Long id
    String code //账号
    String username //用户名
    int sex //性别
    String lastName //姓
    String firstName //名
    String phoneNo //电话
    String email //邮箱
    String password //密码
}
