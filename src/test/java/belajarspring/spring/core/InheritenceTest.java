package belajarspring.spring.core;

import belajarspring.spring.core.services.MerchantService;
import belajarspring.spring.core.services.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritenceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InherintenceConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testInheritence() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService,merchantServiceImpl);
    }
}
