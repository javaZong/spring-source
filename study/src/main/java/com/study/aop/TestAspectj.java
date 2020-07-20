package com.study.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * 通过组件扫描自动检测方面
 * 您可以将方面类注册为Spring XML配置中的常规bean，也可以通过类路径扫描自动检测它们-
 * 与其他任何Spring管理的bean一样。但是，请注意，@Aspect注释不足以在类路径中进行自动检测。
 * 为此，您需要添加一个单独的@Component注释（或者，或者，按照Spring的组件扫描程序的规则，
 * 一个合格的自定义原型注释）。
 */
//@Component
@Aspect
public class TestAspectj {

	@Pointcut("execution(* com.study.bean.*.test())")
	public void test(){
		System.out.println("aspectj-test");
	}

	@Before("test()")
	public void beforeTest(){
		System.out.println("AOP-before test()");
	}

	@After("test()")
	public void after(){
		System.out.println("Aop-finally");
	}
	public void introduction(){

	}
}
