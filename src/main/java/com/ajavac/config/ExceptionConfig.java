package com.ajavac.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制层异常处理器
 * Created by wyp0596 on 21/03/2017.
 */
@RestControllerAdvice
public class ExceptionConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(HttpServletRequest request,
                                         Exception exception) {
        logger.warn("异常:", exception);


        return new Object();
    }
}
