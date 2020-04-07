package com.study.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author My
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("testBean".equals(beanName)){
			if (bean==null){
				System.out.println("postProcessBeforeInitialization-testBean is null");
			}else {
				System.out.println("postProcessBeforeInitialization-testBean is not null");
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("testBean".equals(beanName)){
			if (bean==null){


				System.out.println("postProcessAfterInitialization-testBean is null");
			}else {
				System.out.println("postProcessAfterInitialization-testBean is not null");
			}
		}
		return bean;
	}
}
