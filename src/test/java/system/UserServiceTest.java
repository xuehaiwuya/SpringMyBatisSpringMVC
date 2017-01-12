package system;

import com.panxiang.system.entities.User;
import com.panxiang.system.service.UserService;
import common.SpringTestBase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author PanXiang
 * @version 1.0
 * @date 2017-01-11.
 */
public class UserServiceTest extends SpringTestBase{
    @Resource
   private UserService userService;

    @Test
    public void testGetUser(){
        User user = userService.getUser(1);
        System.out.println(user.getName());
        System.out.println(user.getPwd());
    }
}
