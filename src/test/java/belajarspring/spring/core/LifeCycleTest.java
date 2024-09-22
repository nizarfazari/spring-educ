package belajarspring.spring.core;

import belajarspring.spring.core.bean.Connection;
import belajarspring.spring.core.bean.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
//        applicationContext.registerShutdownHook(); -> jika ingin otomatis mati
    }


    @Test
    void testConnection() {
       Connection connection =   applicationContext.getBean(Connection.class);

    }


    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }
}
