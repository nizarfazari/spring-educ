package belajarspring.spring.core;


import belajarspring.spring.core.configuration.BarConfiguration;
import belajarspring.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class ImportConfiguration {

}
