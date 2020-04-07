package com.study.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestB {
	public TestB(){
		System.out.println("TestB-init");
	}

	@Autowired
	private TestA testA;

	@Autowired
	private TestB testC;


	public void test(){
		System.out.println("TestB-test");
	}

	public void test2(){
		System.out.println("TestB-test2");
		testA.test();
	}

}
