package com.imooc.utils;

import com.imooc.vo.ResultVO;

/**
 * created by jiangzuole on 2019/3/27 0027.
 */
public class ResultVOUtil {
    //返回静态方法
    public static ResultVO SUCCESS(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO SUCCESS(){
        return SUCCESS(null);
    }

    public static ResultVO ERROR(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("失败");
        return resultVO;
    }
}
