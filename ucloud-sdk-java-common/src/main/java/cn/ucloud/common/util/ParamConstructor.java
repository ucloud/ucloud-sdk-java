package cn.ucloud.common.util;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @description: http请求参数构造器
 * @author: codezhang
 * @date: 2018-09-13 17:37
 **/

public class ParamConstructor {


    /**
     * 将参数对象 构造成http GET请求的参数字符串
     *
     * @param baseRequestParam 参数对象
     * @return GET请求的请求数据字符串
     * @throws Exception 可能是NullPointerException（参数对象为空）或者ValidatorException（参数对象属性不满足要求）
     */
    public static String getHttpGetParamString(BaseRequestParam baseRequestParam, Account account) throws Exception {
        // 设置publicKey
        baseRequestParam.setPublicKey(account.getPublicKey());
        // 将参数对象转成List<Param>
        List<Param> paramList = ObjectToParam.objectToParams(baseRequestParam);
        // 获取签名字符串
        String signature = Signature.getSignature(paramList, account);
        // 设置签名 到参数对象
        baseRequestParam.setSignature(signature);
        // 参数校验
        ParamValidator.validator(baseRequestParam);
        // url编码
        Signature.urlEncodeParams(paramList);
        // 构造url参数
        StringBuilder builder = new StringBuilder();
        for (Param param : paramList) {
            if (StringUtils.isBlank(param.getParamKey())){
                continue;
            }
            builder.append(param.getParamKey() + "=" + param.getParamValue() + "&");
        }
        // 设置签名
        builder.append("Signature" + "=" + signature);
        return builder.toString();
    }

}
