import com.shen.ssm.dao.UserDao;
import com.shen.ssm.domain.UserInfo;
import com.shen.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserInfoTest {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        System.out.println("-------------------------------------------------");
        UserInfo aSuper = userDao.findUserByUsername("super");
        System.out.println(aSuper);
        System.out.println("-------------------------------------------------");

    }

    @Test
    public void test02(){
        System.out.println("-------------------------------------------------");
        List<UserInfo> all = userService.findAll();
        for (UserInfo userInfo : all) {
            System.out.println(userInfo);
        }
        System.out.println("-------------------------------------------------");

    }

    @Test
    public void test03(){
        System.out.println("-------------------------------------------------");
        UserInfo userInfo = userService.showUserById("1111");
        System.out.println(userInfo);
        System.out.println("-------------------------------------------------");

    }
}
