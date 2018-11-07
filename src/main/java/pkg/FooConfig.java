package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

//@Lazy
@Configuration
@ComponentScan
public class FooConfig {
    static Logger logger = LoggerFactory.getLogger(FooConfig.class);
    @Bean
    public FooService fooService() {
        logger.warn("fooService in foo config");
        return new FooService();
    }

    @Bean
    public AbcService abcService() {
        return new AbcService();
    }

    public FooConfig() {
        logger.info("foo config ctor");
    }
}
