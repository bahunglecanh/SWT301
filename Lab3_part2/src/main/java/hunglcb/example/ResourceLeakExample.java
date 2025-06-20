package hunglcb.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ResourceLeakExample {
    private static final Logger logger=Logger.getLogger(ResourceLeakExample.class.getName());
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                logger.info(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
