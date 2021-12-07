package hello.proxy.pureproxy.decoreator.code;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component {
    private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operator() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();

        String result = component.operator();
        long endTime = System.currentTimeMillis();

        long resultTime = startTime - endTime;
        log.info("TimeDecorator 종료 resultTime={}ms", resultTime);

        return result;
    }
}
