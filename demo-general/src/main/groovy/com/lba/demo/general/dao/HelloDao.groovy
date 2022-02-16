package com.lba.demo.general.dao

import com.lba.demo.entity.user.Hello
import org.springframework.data.jpa.repository.JpaRepository;


interface HelloDao extends JpaRepository<Hello,Integer>{
    List<Hello> findByUserName(List<Integer> testList)
}
