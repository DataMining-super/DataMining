package test.User;

import com.swpu.mapper.UserDao;
import com.swpu.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

/**
 * 描述:
 * 用户数据库相关操作的测试
 *
 * @author ace-huang
 * @create 2019-07-19 5:37 PM
 */
public class UserDaoTest extends BasicTest{

    @Autowired
    private UserDao userDao;

    @Test
    public void testUserLogin(){

        Users user = new Users();
        user.setUsername("abc");
        Users currentUser = userDao.queryByUsername(user);
        System.out.println(currentUser.toString());
    }


}