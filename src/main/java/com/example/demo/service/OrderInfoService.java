package com.example.demo.service;

import com.example.demo.entity.OrderInfo;
import com.example.demo.mapper.OrderInfoMapper;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    public static Long userId = 151L;

    public void queryOrderById() {

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(userId);
        orderInfo.setAccount("Account-w");
        orderInfo.setPassword("pass-w");
        orderInfo.setUserName("name-w");
        orderInfoMapper.insert(orderInfo);


        System.out.println("query--------------");
        OrderInfo order = orderInfoMapper.selectByPrimaryKey(userId);
        System.out.println(order.getUserName());
    }
}
