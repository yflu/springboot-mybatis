package com.eric.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eric on 2017/9/21.
 */
@Controller
public class IndexController extends BaseController{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }
}
