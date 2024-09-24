package belajarspring.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "belajarspring.spring.core.imports"
        }
)
public class ScanConfiguration {


}
