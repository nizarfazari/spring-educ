package belajarspring.spring.core;

import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import belajarspring.spring.core.bean.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;


/*
    Depends On digunakan untuk Bean dibuat saat setelah bean lain
    Jadi dibawah Bar akan dibuat terlebih dahulu daripada Foo
*/
@Configuration
public class DependecyInjectionConfiguration {

    @Bean
    @Primary
    @DependsOn({
        "bar"
    })
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
