package com.logback.logback_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    
    //private final Logger logger=LoggerFactory.getLogger(MyAppController.class);
    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String myApp(){
        logger.info("This is a {} message","info");
        logger.debug("This is a {} message","debug");
        logger.warn("This is a {} message","warn");
        logger.error("This is a {} message","error");
        return "index";
    }
}
