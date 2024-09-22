package belajarspring.spring.core;


import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Bean
    public Foo foo() {
        log.info("Create New Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create New Bar");
        return new Bar();
    }


}
