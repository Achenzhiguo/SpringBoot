package com.czg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/12 - 05 - 12 - 2:01
 * @Description: com.czg.controller
 * @version: 1.0
 */
@Controller
public class firstController {
    @RequestMapping("aaa")
    public String first(){
        System.out.println("i am coming");
        return "showVip";
    }


}
