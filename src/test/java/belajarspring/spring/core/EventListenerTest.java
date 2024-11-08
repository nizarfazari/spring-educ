package belajarspring.spring.core;

import belajarspring.spring.core.listener.LoginSuccessListeners;
import belajarspring.spring.core.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {


    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListeners.class
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
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("nizar","nizar");
        userService.login("nizar","salah");
    }
}
