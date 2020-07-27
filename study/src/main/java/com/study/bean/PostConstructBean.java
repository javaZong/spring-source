package com.study.bean;


import com.study.MayConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * java
 *
 * @author zongchao
 */
@Component
public class PostConstructBean implements InitializingBean {

	@Autowired
	private CommonBean commonBean;

	@PostConstruct
	public void init(){
		System.out.println("testBean PostConstruct");
	}



	public void test(){
		System.out.println("testBean");
	}

	/**
	 * 发生在PostConstruct之后
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MayConfig.class);
		PostConstructBean bean = context.getBean(PostConstructBean.class);
		bean.test();

	}
}
