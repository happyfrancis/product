/**
 * @program: product
 * @description:
 * @author: Francis
 * @create: 2018-04-12 17:01
 **/

package com.imooc.product.utils;

import com.imooc.product.VO.ResultVo;

public class ResultVoUtil {

    public static ResultVo success(Object obj) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(obj);
        return resultVo;
    }
}
