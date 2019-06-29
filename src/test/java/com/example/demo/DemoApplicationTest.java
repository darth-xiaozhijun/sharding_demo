package com.example.demo;

import com.example.demo.service.DemoService;
import com.example.demo.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

	@Resource
	private DemoService demoService;

	@Resource
	private OrderInfoService orderInfoService;


	@Test
	public void shardingDemo() {
		//sharding测试
		demoService.demo();
	}


	@Test
	public void queryUserInfo() {
		//sharding测试
		demoService.queryUserIfo();
	}


	@Test
	public void queryOrderById() {
		//sharding测试 - 主数据库
		orderInfoService.queryOrderById();
	}
}
