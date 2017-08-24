package com.ajavac;

import com.ajavac.res.TestRes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * 测试接口测试
 * Created by wyp0596 on 17/08/2017.
 */
public class TestAPITest extends SSSMApplicationTests {

    @Test
    public void testAPI() {
        Integer number = new Random(System.currentTimeMillis()).nextInt();
        TestRes testRes = restTemplate.getForObject("http://localhost:" + port + "/test/" + number, TestRes.class);
        Assert.assertEquals(testRes.getNumber(), number);
    }
}
