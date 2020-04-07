package com.study.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestA {
	public TestA(){
		System.out.println("TestA-init");
	}

	@Autowired
	private TestB testB;

	@Autowired
	private TestB testC;
	public void test(){
		System.out.println("testA-test");
	}

	public void test2(){
		System.out.println("TestA-test2");
		testB.test();
	}
}
