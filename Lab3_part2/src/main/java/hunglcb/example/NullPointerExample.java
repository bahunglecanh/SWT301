package hunglcb.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NullPointerExample {
    private static final Logger logger =
            LoggerFactory.getLogger(NullPointerExample.class);

    public static void main(String[] args) {
        String text = getRandomString();  // có thể trả về null

        if (text!=null && text.isEmpty()){
            logger.info("Text is not empty");
        }else {
            logger.warn("Text is null or empty");
        }
    }

    /**
     * Giả lập lấy đầu vào, ngẫu nhiên trả về null hoặc một chuỗi.
     */
    private static String getRandomString() {

        return Math.random()>0.5?"Hello World":null;
    }
}
