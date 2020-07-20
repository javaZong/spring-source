package com.study.bean;

import com.study.MayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 构造函数注入
 */
@Component
public class ConstructInjectionBean {

	private CommonBean commonBean;
	private PostConstructBean postConstructBean;

	@Autowired
	public ConstructInjectionBean(CommonBean test1, PostConstructBean test2) {
		commonBean = test1;
		this.postConstructBean = test2;
	}

	public void test() {
		System.out.println(commonBean);
	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		ConstructInjectionBean bean = (ConstructInjectionBean) context.getBean("constructInjectionBean");
		bean.test();

	}
}
