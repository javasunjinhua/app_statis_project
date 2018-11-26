package com.bigdata.applogs.visualize.service;
import com.bigdata.applogs.visualize.domain.StatBean;
import java.util.List;

/**
 * Service
 */
public interface StatService {

   List<StatBean> findThisWeekNewUsers(String appid);
}