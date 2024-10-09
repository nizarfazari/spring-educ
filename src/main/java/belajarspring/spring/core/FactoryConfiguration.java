package belajarspring.spring.core;


import belajarspring.spring.core.factory.PaymentGatewayClientFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactory.class
})
public class FactoryConfiguration {


}
