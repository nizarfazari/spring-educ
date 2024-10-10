package belajarspring.spring.core;


import belajarspring.spring.core.services.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InherintenceConfiguration {
}
