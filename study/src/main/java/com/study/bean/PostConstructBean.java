package com.study.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * java
 *
 * @author zongchao
 */
@Component
public class PostConstructBean {

	@Autowired
	private CommonBean commonBean;

	@PostConstruct
	public void init(){
		System.out.println("testBean PostConstruct");
	}



	public void test(){
		System.out.println("testBean");
	}
}
