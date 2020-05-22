package com.hc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hc.bean.DataTable;
import com.hc.domain.Admin;
import com.hc.mapper.AdminMapper;
import com.hc.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:00
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public DataTable<Admin> getAllByCondition(Admin admin, Integer sEcho, Integer pageNum, Integer pageSize) {
        DataTable<Admin> res = new DataTable<>();
        Page<Admin> page = PageHelper.startPage(pageNum, pageSize);
        adminMapper.selectByCondition(admin);
        res.setDraw(sEcho);
        res.setRecordsTotal(page.getTotal());
        res.setRecordsFiltered(page.getTotal());
        res.setData(page.getResult());
        return res;
    }

}
