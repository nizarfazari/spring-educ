package belajarspring.spring.core;

import belajarspring.spring.core.services.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Slf4j
    @Import({
            AuthService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testAware() {
        AuthService authService = applicationContext.getBean(AuthService.class);

        Assertions.assertEquals("belajarspring.spring.core.services.AuthService", authService.getBeanName());
        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertSame(authService.getApplicationContext() , applicationContext);
    }
}
