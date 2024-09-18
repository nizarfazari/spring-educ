package belajarspring.spring.core.bean;

import belajarspring.spring.core.bean.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryConfiguation {
    @Bean
    @Primary
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
