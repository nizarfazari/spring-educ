package belajarspring.spring.core;

import belajarspring.spring.core.bean.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection(){
        return  new Connection();
    }


}
