package com.ajavac.res;

import java.time.LocalDateTime;

/**
 * 测试返回信息
 * Created by wyp0596 on 17/08/2017.
 */
public class TestRes {

    private Integer number;

    private String dateTime;

    public TestRes() {
        number = 1;
        dateTime = LocalDateTime.now().toString();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
