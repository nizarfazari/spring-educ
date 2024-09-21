package belajarspring.spring.core;

import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import belajarspring.spring.core.bean.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependecyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return  new Foo();
    }

    @Bean
    public Bar bar(){
        return  new Bar();
    }


    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo,bar);
    }

}
