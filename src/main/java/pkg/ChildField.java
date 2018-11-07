package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ChildField {
    private static final Logger logger = LoggerFactory.getLogger(ChildField.class);

    public ChildField() {
        logger.info("child fields ctor");
    }
}
