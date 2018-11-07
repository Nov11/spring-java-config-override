package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class MockField {
    static Logger logger = LoggerFactory.getLogger(MockField.class);

    public MockField() {
        logger.info("MockFields ctor");
    }
}
