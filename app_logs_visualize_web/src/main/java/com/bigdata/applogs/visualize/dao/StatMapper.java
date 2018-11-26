package com.bigdata.applogs.visualize.dao;

import com.bigdata.applogs.visualize.domain.StatBean;

import java.util.List;

public interface StatMapper<T> {
    List<StatBean> findThisWeekNewUsers(String appid);
}