package com.study.bean.impl;

import com.study.MayConfig;
import com.study.bean.CommonBean;
import com.study.bean.ConstructInjectionBean;
import com.study.bean.Test2Service;
import com.study.bean.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * beanName为testServiceImpl
 */
@Service
public class TestServiceImpl implements TestService, Test2Service {

	/**t
	 * 测试循环依赖
	 */
	@Autowired
	private CommonBean testBean;

	@Override
	public void test(){
		System.out.println("testService-test");
	}

	@Override
	public void test2() {
		testBean.test();
	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		TestService bean = (TestService) context.getBean("testServiceImpl");
		bean.test();

	}
}
