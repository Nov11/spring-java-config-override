package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class FooService {
    private static final Logger logger = LoggerFactory.getLogger(FooService.class);

    @Autowired
    MockField mockField;

    public FooService() {
        logger.warn("foo service ctor");
    }

    public MockField getMockField() {
        return mockField;
    }
}
