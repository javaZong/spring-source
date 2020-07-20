package com.study.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author My
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

	/**
	 * 检查Aware相关接口并设置相关依赖之前
	 * 各种init之前（InitializingBean、PostConstruct）
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
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

	/**
	 * 各种init之后（InitializingBean、PostConstruct）
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
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
