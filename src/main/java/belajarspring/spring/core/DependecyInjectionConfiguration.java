package belajarspring.spring.core;

import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import belajarspring.spring.core.bean.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependecyInjectionConfiguration {

    @Bean
    @Primary
    public Foo fooFirst(){
        return  new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return  new Foo();
    }

    @Bean
    public Bar bar(){
        return  new Bar();
    }


    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo,bar);
    }

}
