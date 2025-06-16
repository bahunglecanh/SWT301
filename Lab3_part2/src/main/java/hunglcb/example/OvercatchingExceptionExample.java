package hunglcb.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class OvercatchingExceptionExample {
    private static final Logger logger =
            LoggerFactory.getLogger(OvercatchingExceptionExample.class);

    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            // Cố tình truy cập phần tử ngoài giới hạn mảng
            logger.info("Attempting to access array element at index 10");
            int value = arr[10];
            logger.info("Element at index 10 is {}", value);

        } catch (IndexOutOfBoundsException ex) {
            // Bắt riêng lỗi truy cập chỉ số ngoài mảng
            logger.error("Index out of bounds: {}", ex.getMessage(), ex);

        } catch (Exception ex) {
            // Bắt chung mọi Exception khác (over-catching)
            logger.error("Unexpected error occurred: {}", ex.getMessage(), ex);
        }
    }
}
