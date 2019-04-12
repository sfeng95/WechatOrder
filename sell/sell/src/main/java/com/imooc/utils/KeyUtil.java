package com.imooc.utils;

import java.util.Random;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
public class  KeyUtil {
    /**
     * 生成唯一主键
     * 格式：时间+随机数
     */



    public static synchronized String genUniqueKey(){
        System.currentTimeMillis();
        Random random = new Random();
        int number =  random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
