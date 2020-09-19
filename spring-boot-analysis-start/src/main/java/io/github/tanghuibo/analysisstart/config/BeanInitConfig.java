package io.github.tanghuibo.analysisstart.config;

import io.github.tanghuibo.analysisstart.store.BeanStartStore;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author tanghuibo
 * @date 2020/9/19下午10:47
 */
public class BeanInitConfig implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        BeanStartStore.setStart(beanName, bean.getClass().getName());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        BeanStartStore.setEnd(beanName);
        return bean;
    }
}
