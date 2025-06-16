import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsureLoginTest {

    @Test
    void testLoginSuccess() {
        // Kiểm tra đăng nhập với tài khoản và mật khẩu đúng
        boolean result = InsecureLogin.login("admin", "123456");

        // Kiểm tra nếu login thành công
        assertTrue(result);
    }

    @Test
    void testLoginFail() {
        // Kiểm tra đăng nhập với tài khoản và mật khẩu sai
        boolean result = InsecureLogin.login("user", "wrongpassword");

        // Kiểm tra nếu login thất bại
        assertFalse(result);
    }

    @Test
    void testPrintUserInfo() {
        // Kiểm tra thông tin người dùng
        InsecureLogin insecureLogin = new InsecureLogin();
        boolean result = insecureLogin.printUserInfo("John Doe");

        // Kiểm tra nếu việc in thông tin người dùng thành công
        assertTrue(result);
    }

}
