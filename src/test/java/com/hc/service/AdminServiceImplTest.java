package com.hc.service;

import com.alibaba.fastjson.JSON;
import com.hc.bean.DataTable;
import com.hc.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 19:34
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceImplTest {

    @Resource
    private AdminService adminService;

    @Test
    public void getAllByCondition() {
        Admin admin = Admin.builder()
                .account("a")
                .nickname("a")
                .build();
        DataTable<Admin> res = adminService.getAllByCondition(admin,1, 3, 2);
        System.out.println(res);
        System.out.println(JSON.toJSONString(res));
    }

}