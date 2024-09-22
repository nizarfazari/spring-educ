package belajarspring.spring.core.imports;

import belajarspring.spring.core.bean.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo(){
        return  new Foo();
    }


}
