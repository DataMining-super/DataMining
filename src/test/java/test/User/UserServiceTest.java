package test.User;

import com.swpu.exeception.UserException;
import com.swpu.pojo.Users;
import com.swpu.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

/**
 * 描述:
 * 用户service的测试
 *
 * @author ace-huang
 * @create 2019-07-19 4:19 PM
 */
public class UserServiceTest extends BasicTest {
    @Autowired
    private UserService userservice;

    @Test
    public void testRegister() throws UserException {

        Users user = new Users();
        user.setUsername("test");
        user.setPassword("test");
        userservice.registerUser(user);
    }

}