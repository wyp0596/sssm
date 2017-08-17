package com.ajavac;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 * Created by wyp0596 on 17/08/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
public class SSSMApplicationTest {

    @Test
    public void contextLoads() {
    }
}