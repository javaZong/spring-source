package com.study;

import com.study.MayConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试入口
 *
 * @author zongchao
 */
public class TestEntry {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
//		TestService testService= context.getBean(TestService.class);
//		// 同一个实例
//		System.out.println(testService.toString());
//		Test2Service test2Service= context.getBean(Test2Service.class);
//		System.out.println(test2Service.toString());
//		testService.test();
//		if (testService instanceof TestService){
//			System.out.println("testService instanceof TestService");
//		}
//		if (testService instanceof TestServiceImpl){
//			System.out.println("testService instanceof TestServiceImpl");
//		}

	}
}
