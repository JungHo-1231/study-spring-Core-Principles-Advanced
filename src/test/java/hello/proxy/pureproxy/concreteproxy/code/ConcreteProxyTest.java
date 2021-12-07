package hello.proxy.pureproxy.concreteproxy.code;

import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() throws Exception{
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }


    
    @Test
    void addProxy() throws Exception{
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }

}


