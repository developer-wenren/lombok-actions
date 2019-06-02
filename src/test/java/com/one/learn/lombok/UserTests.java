package com.one.learn.lombok;

import com.one.learn.lombok.bean.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * 用户实体类
 *
 * @author One
 * @date 2019/06/02
 */
@Slf4j
public class UserTests {
    @Test
    public void test() {
        User user = new User();
        user.setUsername("one");
        user.setPassword("zxc123");
        Assert.assertEquals(user.getUsername(), "one");
        Assert.assertEquals(user.getPassword(), "zxc123");
    }

    @Test
    public void test2() {
        User2 user2 = new User2(1, "user2", "zcx123");
        System.out.println(user2);
    }

    @Test
    public void testEqual() {
        User4 user4 = new User4(1, "user4", "zxc");
        User4 user4_2 = new User4(1, "user4", "123");
        Assert.assertEquals(user4, user4_2);
    }

    @Test
    public void testLog() {
        User5 user5 = new User5();
        user5.setId(1);
        user5.setUsername("user5");
        user5.setPassword("zxc123");
        log.warn("testLog: {}", user5);
    }


    @Test
    public void testBuilder() {
        User6 user6 = User6.builder().id(1).username("user6").password("zxc123").build();
        log.warn("testLog: {}", user6);
    }
}
