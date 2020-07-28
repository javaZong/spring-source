package com.study.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class TestFactoryBean implements FactoryBean<CommonBean> {
	@Override
	public CommonBean getObject() throws Exception {
		System.out.println("FactoryBean-getObject");
		return new CommonBean();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("FactoryBean-getObjectType");
		return CommonBean.class;
	}


}
