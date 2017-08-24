package com.ajavac;

import com.ajavac.dao.UserDao;
import com.ajavac.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户测试
 * Created by wyp0596 on 17/08/2017.
 */
public class UserTest extends SSSMApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void adminUser() {
        User user = userDao.getByUsername("admin");
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getPassword(), "admin");
    }

}
