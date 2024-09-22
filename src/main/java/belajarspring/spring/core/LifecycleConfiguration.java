package belajarspring.spring.core;

import belajarspring.spring.core.bean.Connection;
import belajarspring.spring.core.bean.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection(){
        return  new Connection();
    }


    @Bean(initMethod = "start", destroyMethod = "closed")
    public Server server(){
        return  new Server();
    }


}
