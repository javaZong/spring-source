package com.study.service.impl;

import com.study.service.TestService;
import com.study.test.TestBean;
import com.study.test.TestC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * beanName默认为testServiceImpl
 */
@Service
public class TestServiceImpl implements TestService {

	/**t
	 * 测试循环依赖
	 */
	@Autowired
	private TestBean testBean;

	@Autowired
	private TestC testC;

	@Override
	public void test(){
		System.out.println("testService-test");
	}

	@Override
	public void test2() {
		testBean.test();
	}
}
