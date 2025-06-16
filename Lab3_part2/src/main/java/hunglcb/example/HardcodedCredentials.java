package hunglcb.example;

import java.util.logging.Logger;

public class HardcodedCredentials {
    private static final Logger logger=Logger.getLogger(HardcodedCredentials.class.getName());
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456"; // hardcoded password
        if(authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.info("Access denied");
        }
    }

    private static boolean authenticate(String user, String pass) {
        // Dummy authentication logic
        return user.equals("admin") && pass.equals("123456");
    }
}
