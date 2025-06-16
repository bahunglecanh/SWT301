package hunglcb.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnreachableCodeExample {
    private static final Logger logger= LoggerFactory.getLogger(UnreachableCodeExample.class);
    public static int getNumber() {
        logger.info("This will never execute");
        return 42;
    }

    public static void main(String[] args) {
        logger.info("The number is: {}",getNumber());
    }
}
