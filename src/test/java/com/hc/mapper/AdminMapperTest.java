package com.hc.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hc.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:04
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTest {

    @Resource
    private AdminMapper adminMapper;

    @Test
    public void selectByPrimaryKey() {
        Admin admin = adminMapper.selectByPrimaryKey(1);
        System.out.println(admin);
        System.out.println(adminMapper);
    }

    @Test
    public void selectByCondition() {
        Admin admin = null;
        admin = new Admin();
        admin.setAccount("an");
        LocalDate time1 = LocalDate.of(2020, 5, 10);
        admin.setTime1(time1);
        LocalDate time2 = LocalDate.of(2020, 5, 15);
        admin.setTime2(time2);
        System.out.println(admin);
        List<Admin> admins = adminMapper.selectByCondition(admin);
        admins.forEach(System.out::println);
    }

    @Test
    public void page() {
        Admin admin = null;
        admin = new Admin();
        admin.setAccount("a");
        Page<Admin> page = PageHelper.startPage(3, 2);
        adminMapper.selectByCondition(admin);
        System.out.println(page);
        List<Admin> admins = page.getResult();
        admins.forEach(System.out::println);
    }

}