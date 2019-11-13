package com.dongtian.shopcommonutils.JsonData;

import java.util.HashMap;
import java.util.Map;

public class BaseApiService {
    /*
     *   @methodDesc: 功能描述:(自定义返回)
     *   @param  code : 响应码
     *   @param  msg  : 响应消息
	 *   @param  data ：响应数据
     */
    public static Map<String, Object> setResult(Integer code, String msg, Object data) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(BaseApiConstants.HTTP_CODE_NAME, code);
        result.put(BaseApiConstants.HTTP_200_NAME, msg);
        if (data != null)
            result.put(BaseApiConstants.HTTP_DATA_NAME, data);
        return result;
    }
    //响应错误，不返回数据
    //@return : 500 msg null
    public static Map<String, Object> setResultError(String msg) {
        return setResult(BaseApiConstants.HTTP_500_CODE, msg, null);
    }

    //响应成功，不返回数据
    //@return : 200 msg null
    public static Map<String, Object> setResultSuccess(String msg) {
        return setResult(BaseApiConstants.HTTP_200_CODE, msg, null);
    }
    //响应成功，并返回数据
    //@return : 200 SUCCESS data
    public static Map<String, Object> setResultSuccessData(Object data) {
        return setResult(BaseApiConstants.HTTP_200_CODE, BaseApiConstants.HTTP_SUCCESS_NAME, data);
    }
    //响应成功，不返回数据
    //@return : 200 SUCCESS null
    public static Map<String, Object> setResultSuccess() {
        return setResult(BaseApiConstants.HTTP_200_CODE, BaseApiConstants.HTTP_SUCCESS_NAME, null);
    }

}
