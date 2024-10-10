package belajarspring.spring.core;

import belajarspring.spring.core.bean.data.Car;
import belajarspring.spring.core.processor.IdGeneratorPostProcessor;
import belajarspring.spring.core.processor.PrefixIdGeneratorProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class BeanPostProcessorTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorPostProcessor.class,
            PrefixIdGeneratorProcessor.class
    })
    public static class TestConfiguration {

    }


    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testCar() {
        Car car = applicationContext.getBean(Car.class);

        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());
    }

    @Test
    void testPrefixCar() {
        Car car = applicationContext.getBean(Car.class);

        Assertions.assertNotNull(car.getId());

        Assertions.assertTrue(car.getId().startsWith("PREFIX-"));
    }
}
