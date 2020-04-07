package com.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class TestAspectj {

	@Pointcut("execution(* com.study.service..*.test())")
	public void test(){
		System.out.println("aspectj-test");
	}

	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}
}
