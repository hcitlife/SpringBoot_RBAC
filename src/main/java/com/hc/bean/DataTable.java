package com.hc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/5/22 15:18
 * @Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataTable<T> {
    private Integer draw;//绘制次数，一定要回传，前台会根据绘制次数，判断是否要刷新当前列表
    private Long recordsTotal; //总数量
    private Long recordsFiltered;//过滤查询后的数量
    private List<T> data;//当前分页数据
}
