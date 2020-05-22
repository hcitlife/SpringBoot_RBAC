package com.hc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hc.bean.DataTable;
import com.hc.bean.res.Result;
import com.hc.bean.res.ResultCode;
import com.hc.bean.res.ResultUtil;
import com.hc.domain.Admin;
import com.hc.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 梁云亮
 * @Date 2020/5/20 13:41
 * @Description:
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/list")
    public Result<Admin> list(String aoData) {
        Admin admin = new Admin();
        Integer sEcho = 1;//请求次数
        String sSearch = ""; //搜索字符患上
        Integer displayStart = 1; //第一条记录下标
        Integer displayLength = 10;//最后一条记录下标

        System.out.println(aoData);
        JSONArray array = JSONArray.parseArray(aoData);
        //这里获取从前台传递过来的参数，从而确保是否分页、是否进行查询、是否排序等
        for (int i = 0; i < array.size(); i++) {
            JSONObject obj = (JSONObject) array.get(i);
            if (obj.get("name").equals("sEcho")) {
                sEcho = obj.getIntValue("value");
            }
            if (obj.get("name").equals("sSearch")) {
                sSearch = obj.getString("sSearch");
            }
            if (obj.get("name").equals("iDisplayStart")) {
                displayStart = obj.getIntValue("value");
            }
            if (obj.get("name").equals("iDisplayLength")) {
                displayLength = obj.getIntValue("value");
            }
        }

        int pageNum = displayStart / displayLength + 1;
        DataTable<Admin> dataTable = adminService.getAllByCondition(admin, sEcho, pageNum, displayLength);
        String res = JSON.toJSONString(dataTable);
        System.out.println(res);

        return ResultUtil.success(dataTable);
    }

    @ResponseBody
    @PostMapping("/enableDisable")
    public Result<Integer> enableDisable(Integer id, Integer status) {
        Admin admin = Admin.builder().id(id).status(status).build();
        int i = adminService.updateByPrimaryKeySelective(admin);
        if (i == 1) {
            return ResultUtil.success(id);
        } else {
            return ResultUtil.fail(ResultCode.FAIL);
        }
    }

}
