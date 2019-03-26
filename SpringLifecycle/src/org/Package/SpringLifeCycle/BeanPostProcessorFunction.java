package org.Package.SpringLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorFunction implements BeanPostProcessor{
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
		
		return bean;
	}
}
