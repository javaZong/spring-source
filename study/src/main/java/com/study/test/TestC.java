package com.study.test;

import org.springframework.stereotype.Component;

@Component
public class TestC {
	public TestC(){
		System.out.println("TestC-init");

	}
	public void testC(){
		System.out.println("testC-test");
	}
}
