package com.study.test;

import com.study.MayConfig;
import com.study.service.TestService;
import com.study.service.impl.TestServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试入口
 * @author zongchao
 */
public class TestEntry {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		TestService testService= (TestService) context.getBean("testServiceImpl");
		testService.test();
		if (testService instanceof TestService){
			System.out.println("testService instanceof TestService");
		}
		if (testService instanceof TestServiceImpl){
			System.out.println("testService instanceof TestServiceImpl");
		}
	}
}
