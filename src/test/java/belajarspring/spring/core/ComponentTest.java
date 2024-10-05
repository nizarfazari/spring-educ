package belajarspring.spring.core;

import belajarspring.spring.core.repository.CategoryRepository;
import belajarspring.spring.core.repository.CustomerRepository;
import belajarspring.spring.core.services.CategoryService;
import belajarspring.spring.core.services.CustomerService;
import belajarspring.spring.core.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService" ,ProductService.class);

        Assertions.assertSame(productService1,productService2);
    }


    @Test
    void testSetterDI() {

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);


        Assertions.assertSame(categoryService.getCategoryRepository(),categoryRepository);

    }


    @Test
    void testFieldDI() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

        Assertions.assertSame(customerService.getCustomerRepository(),customerRepository);
    }
}
