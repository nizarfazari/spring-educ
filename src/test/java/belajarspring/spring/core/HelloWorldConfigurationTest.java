package belajarspring.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldConfigurationTest {
    @Test
    void testApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        Assertions.assertNotNull(context);
    }
}