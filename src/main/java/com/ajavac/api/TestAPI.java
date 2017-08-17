package com.ajavac.api;

import com.ajavac.res.TestRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * Created by wyp0596 on 17/08/2017.
 */
@RestController
public class TestAPI {

    @GetMapping("test")
    public TestRes test() {
        return new TestRes();
    }

}
