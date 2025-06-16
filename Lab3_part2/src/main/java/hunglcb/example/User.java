package hunglcb.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



class User {
    private static final Logger logger= LoggerFactory.getLogger(User.class);
    private String name;
    private int age;

    /** Setter không kiểm tra null/độ dài → vi phạm đóng gói */
    public void setName(String name) {
        this.name = name;
    }

    /** Setter không kiểm tra âm → vi phạm đóng gói */
    public void setAge(int age) {
        this.age = age;
    }

    /** Getter trả về giá trị hiện tại */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /** Hiển thị thông tin qua logger */
    public void display() {
        logger.info("Name: {}, Age: {}", name, age);
    }
}
