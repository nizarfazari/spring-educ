package belajarspring.spring.core.processor;

import belajarspring.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Slf4j
public class PrefixIdGeneratorProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Generator" , bean);
        if (bean instanceof IdAware) {
            log.info("Prefix Generator for Bean", bean);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PREFIX-" + idAware.getId());
        }
        return bean;
    }
}
