package hunglcb.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class ApplicationConstants {
    // Chặn khởi tạo
    private ApplicationConstants() {
        throw new AssertionError("Cannot instantiate constants class");
    }

    public static final int MAX_USERS      = 100;
    public static final int MIN_AGE        = 18;
    public static final String DEFAULT_ROLE = "USER";
}

public class InterfaceFieldModificationExample {
    private static final Logger logger =
            LoggerFactory.getLogger(InterfaceFieldModificationExample.class);

    public static void main(String[] args) {
        // In ra giá trị các hằng số
        logger.info("Max users: {}, Min age: {}, Default role: {}",
                ApplicationConstants.MAX_USERS,
                ApplicationConstants.MIN_AGE,
                ApplicationConstants.DEFAULT_ROLE
        );
    }
}