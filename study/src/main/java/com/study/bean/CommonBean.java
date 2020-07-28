package com.study.bean;

import com.study.MayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CommonBean {

	@Autowired
	private TestService testService;

	public void test() {

		System.out.println("commonBean test," );

	}

	public void test(String a) {
		testService.test();
		System.out.println("commonBean test-a");
//		throw new RuntimeException("commonBean");
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		CommonBean bean = context.getBean(CommonBean.class);
		bean.test("a");

	}
}
