package cn.ucloud.util;

import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import java.util.List;

/**
 * @description: http请求参数构造器
 * @author: codezhang
 * @date: 2018-09-13 17:37
 **/

public class ParamConstructor {


    /**
     * 将参数对象 构造成http GET请求的参数字符串
     * @param baseRequestParam 参数对象
     * @return GET请求的请求数据字符串
     * @throws Exception 可能是NullPointerException（参数对象为空）或者ValidatorException（参数对象属性不满足要求）
     */
    public static String getHttpGetParamString(BaseRequestParam baseRequestParam, Account account) throws Exception {
        StringBuilder builder=new StringBuilder();
        // 设置publicKey
        baseRequestParam.setPublicKey(account.getPublicKey());
        // 将参数对象转成List<Param>
        List<Param> paramList = ObjectToParam.objectToParams(baseRequestParam);
        String signature = Signature.getSignature(paramList,account);
        // 参数校验
        ParamValidator.validator(paramList);
        // url编码
        Signature.urlEncodeParams(paramList);
        for (Param param:
                paramList) {
            builder.append(param.getParamKey()+"="+param.getParamValue()+"&");
        }
        // 设置签名
        builder.append("Signature"+"="+signature);
        return builder.toString();
    }

}
