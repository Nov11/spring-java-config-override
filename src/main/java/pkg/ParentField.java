package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParentField {
    private static final Logger logger = LoggerFactory.getLogger(ParentField.class);

    public ParentField() {
        logger.info("parent field ctor");
    }
}
