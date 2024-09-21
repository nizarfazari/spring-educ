package belajarspring.spring.core.bean;

import belajarspring.spring.core.bean.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class BeanNameConfiguration {
    @Bean(name = "fooFirst")
    @Primary
    public Foo foo1(){
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
