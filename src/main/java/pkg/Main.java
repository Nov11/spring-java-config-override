package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(BarConfig.class);
        logger.info("context loaded");
        logger.info("load abcService");
        AbcService abcService = configApplicationContext.getBean(AbcService.class);
        logger.info("load fooService");
        FooService fooService = configApplicationContext.getBean(FooService.class);
        logger.info("call mock field getter");
        MockField mockField = fooService.getMockField();
    }
}
