package com.hc.mapper;

import com.hc.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:00
 * @Description:
 */
@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    List<Admin> selectByCondition(Admin admin);

}