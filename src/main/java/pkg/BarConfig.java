package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import({FooConfig.class,})
@Lazy
public class BarConfig {
    static Logger logger = LoggerFactory.getLogger(BarConfig.class);
    @Autowired
    AbcService abc;

    @Bean
    FooService fooService(){
        logger.warn("fooService bar config");
        return new FooService();
    }

    @Autowired
    ChildField childField;

    public BarConfig() {
        logger.info("bar config ctor");
    }
}