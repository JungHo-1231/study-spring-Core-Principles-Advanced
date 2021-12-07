package hello.proxy.pureproxy.decoreator.code;

import lombok.extern.slf4j.Slf4j;

import java.util.Locale;

@Slf4j
public class MessageDecorator implements Component {

    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operator() {
        log.info("MessageDecorator 실행");
        String result = component.operator();
        String decoResult = "****" + result + "****";
        log.info("MessageDecorator 꾸미기 전 ={}, 적용 후 ={} ", result, decoResult);
        return decoResult;
    }
}
