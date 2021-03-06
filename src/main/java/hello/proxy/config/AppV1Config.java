package hello.proxy.config;

import hello.proxy.app.v1.*;
import hello.proxy.config.v1_proxy.inerface_proxy.OrderControllerInterfaceProxy;
import hello.proxy.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV1Config {

    @Bean
    public OrderControllerV1 orderController(){
        return new OrderControllerV1Impl(orderService());
    }

    @Bean
    public OrderServiceV1 orderService() {
        return new OrderServiceV1Impl(orderRepository());
    }

    @Bean
    public OrderRepositoryV1 orderRepository() {
        return new OrderRepositoryV1Impl();
    }

}
