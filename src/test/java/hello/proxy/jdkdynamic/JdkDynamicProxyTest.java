package hello.proxy.jdkdynamic;

import hello.proxy.jdkdynamic.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.nio.channels.spi.AbstractInterruptibleChannel;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA() throws Exception {

        AInteface target = new AImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        AInteface proxy = (AInteface) Proxy.newProxyInstance(
                AInteface.class.getClassLoader(),
                new Class[]{AInteface.class},
                handler
        );

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }

    @Test
    void dynamicB() throws Exception {

        BInteface target = new BImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        BInteface proxy = (BInteface) Proxy.newProxyInstance(
                BInteface.class.getClassLoader(),
                new Class[]{BInteface.class},
                handler
        );

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }
}
