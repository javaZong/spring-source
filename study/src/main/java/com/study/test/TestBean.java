package com.study.test;


import com.study.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * java
 *
 * @author zongchao
 */
@Component(value = "testBean")
public class TestBean {

	@Autowired
	private TestC testC;

	public TestBean(){
		System.out.println("TestBean-init");
	}

	public void test(){
		System.out.println("testBean");
	}
}
