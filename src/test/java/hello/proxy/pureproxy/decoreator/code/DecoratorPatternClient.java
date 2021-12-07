package hello.proxy.pureproxy.decoreator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorPatternClient {

    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }

    public void operate(){
        String result = component.operator();
        log.info("result = {}", result);
    }
}

