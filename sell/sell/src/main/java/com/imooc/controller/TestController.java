package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by jiangzuole on 2019/4/12 0012.
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "MP_verify_c55vJEOIet1cNhSO.txt";
    }

    @RequestMapping("/wechat/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth方法....");
        log.info("code={}"+code);
    }
}
