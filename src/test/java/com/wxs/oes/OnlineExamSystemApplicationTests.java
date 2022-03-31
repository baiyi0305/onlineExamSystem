package com.wxs.oes;

import com.wxs.oes.domain.Admin;
import com.wxs.oes.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineExamSystemApplicationTests {

    @Autowired
    AdminMapper adminMapper;

    @Test
    void contextLoads() {
        Admin admin = adminMapper.selectById(9527);
        System.out.println(admin);
    }

}
