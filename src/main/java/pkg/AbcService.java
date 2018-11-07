package pkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbcService {
    private static final Logger logger = LoggerFactory.getLogger(AbcService.class);
    public AbcService() {
        logger.info("abc service ctor");
    }
}
