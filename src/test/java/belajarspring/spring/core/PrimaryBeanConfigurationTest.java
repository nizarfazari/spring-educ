package belajarspring.spring.core;

import belajarspring.spring.core.bean.PrimaryConfiguation;
import belajarspring.spring.core.bean.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimaryBeanConfigurationTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguation.class);
    }

    @Test
    void testGetPrimary() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("foo1" ,Foo.class);
        Foo foo2 = applicationContext.getBean("foo2" ,Foo.class);
    }
}
