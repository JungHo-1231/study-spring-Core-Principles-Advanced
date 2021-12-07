package hello.proxy.pureproxy.decoreator;

import hello.proxy.pureproxy.decoreator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() throws Exception{
        RealComponent realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.operate();
    }
    
    @Test
    void decorator1() throws Exception{
        Component realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.operate();
    }

    @Test
    void decorator2() throws Exception{
        Component realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        TimeDecorator timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.operate();
    }
}
