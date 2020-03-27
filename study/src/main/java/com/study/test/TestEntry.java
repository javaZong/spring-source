package com.study.test;

import com.study.MayConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试入口
 * @author zongchao
 */
public class TestEntry {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		TestBean testBean = context.getBean(TestBean.class);
		testBean.test();
	}
}
