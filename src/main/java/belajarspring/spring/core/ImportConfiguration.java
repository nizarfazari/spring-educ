package belajarspring.spring.core;


import belajarspring.spring.core.imports.BarConfiguration;
import belajarspring.spring.core.imports.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class ImportConfiguration {

}
