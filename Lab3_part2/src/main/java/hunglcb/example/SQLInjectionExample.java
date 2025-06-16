package hunglcb.example;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class SQLInjectionExample {
    private static final Logger logger = LoggerFactory.getLogger(SQLInjectionExample.class);
    public static void main(String[] args) {
        String userInput = "' OR '1'='1";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        logger.info("Executing query:"+ query);
    }
}
