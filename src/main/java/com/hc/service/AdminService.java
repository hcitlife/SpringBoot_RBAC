package com.hc.service;

import com.hc.bean.DataTable;
import com.hc.domain.Admin;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:00
 * @Description:
 */
public interface AdminService {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    DataTable<Admin> getAllByCondition(Admin admin, Integer sEcho,Integer pageNum, Integer pageSize);
}
