package hunglcb.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class CatchGenericExceptionExample {
    private static final Logger logger = LoggerFactory.getLogger(CatchGenericExceptionExample.class);
    private static final Random random = new Random();

    public static void main(String[] args) {
        try {
            // Lấy chuỗi đầu vào (có thể là một giá trị null để mô phỏng lỗi)
            String input = getUserInput();
            logger.info("Received input: {}", input);

            // Tính độ dài chuỗi — sẽ ném NullPointerException nếu input == null
            int length = input.length();
            logger.info("Input length: {}", length);

        } catch (NullPointerException ex) {
            // Bắt riêng NullPointerException
            logger.error("NullPointerException: Cannot compute length of null string", ex);
        } catch (Exception ex) {
            // Bắt chung tất cả các Exception khác
            logger.error("Unexpected exception occurred", ex);
        }
    }

    /**
     * Giả lập việc lấy dữ liệu đầu vào, có thể trả về null.
     */
    private static String getUserInput() {
        String[] samples = { "Hello", "", null };
        return samples[random.nextInt(samples.length)];
    }
}
