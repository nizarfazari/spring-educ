package belajarspring.spring.core;


import belajarspring.spring.core.bean.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(
        basePackages = {
                "belajarspring.spring.core.services",
                "belajarspring.spring.core.repository",
                "belajarspring.spring.core.configuration"
        }
)
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
