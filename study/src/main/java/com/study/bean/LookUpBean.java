package com.study.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * 方法注入bean
 * <p>
 * 实例化方式为cglib
 */
@Component
public class LookUpBean {

	private CommonBean commonBean;

	public void test() {
		System.out.println(commonBean());
	}

	@Lookup
	public CommonBean commonBean() {
		return null;
	}

	;
}
