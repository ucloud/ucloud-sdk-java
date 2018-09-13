package cn.ucloud.util;

import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.Param;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @description: 签名工具类
 * @author: codezhang
 * @date: 2018-09-12 18:42
 **/


public class Signature {
    // 全局的账户
    private static Account globalAccount;


    public static Account getGlobalAccount() {
        return globalAccount;
    }

    public static void setGlobalAccount(Account globalAccount) {
        Signature.globalAccount = globalAccount;
    }


    /**
     * 获取签名字符串
     *
     * @param params 参数数组
     * @return
     */
    public static String getSignature(Param[] params) {
        String signature = "";
        if (params != null) {
            // 排序
            sortParams(params);
            // url编码
            urlEncodeParmas(params);
            // 拼接参数
            String stitchParams = stitchParams(params);
            // 拼接privateKey
            stitchParams += getGlobalAccount().getPrivateKey();
            // 签名
            signature = SHA1(stitchParams);
        }
        return signature;
    }

    /**
     * @param params
     * @return
     */
    public static Param[] getParamAfterSignature(Param[] params) {
        Object[] objects = insertElement2Array(params, new Param("Signature", getSignature(params)), params.length);
        int len = objects.length;
        Param[] newParams = new Param[len];
        for (int i = 0; i < len; i++) {
            if (objects[i] instanceof Param) {
                newParams[i] = (Param) objects[i];
            }
        }
        return newParams;
    }


    /**
     * 对参数按照key的升序进行排序
     *
     * @param params 参数数组
     */
    private static void sortParams(Param[] params) {
        int num = params.length;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (params[i].getParamKey().compareTo(params[j].getParamKey()) > 0) {
                    Param param = params[i];
                    params[i] = params[j];
                    params[j] = param;
                }
            }
        }
    }

    /**
     * 对参数进行url编码
     *
     * @param params 参数数组
     */
    private static void urlEncodeParmas(Param[] params) {
        if (params != null) {
            int num = params.length;
            for (int i = 0; i < num; i++) {
                try {
                    if (!params[i].getParamKey().equals("PublicKey")) {
                        params[i].setParamValue(URLEncoder.encode(params[i].getParamValue().toString(), "utf-8"));
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 获取签名串
     *
     * @param params 签名参数
     * @return 待签名的签名串
     */
    private static String stitchParams(Param[] params) {
        StringBuilder builder = new StringBuilder();
        if (params != null) {
            int num = params.length;
            for (int i = 0; i < num; i++) {
                builder.append(params[i].getParamKey());
                builder.append(params[i].getParamValue());
            }
        }
        return builder.toString();
    }


    /**
     * sha1加密
     *
     * @param decript 待加密的字符串
     * @return 加密后的字符串
     */
    private static String SHA1(String decript) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            return FormatUtil.formatBytes2HexString(messageDigest, false);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 数组插入元素
     *
     * @param objects 原数组
     * @param element 元素
     * @param index   插入下标
     * @return 新数组
     */
    private static Object[] insertElement2Array(Object[] objects, Object element, int index) {
        Object[] newObjs = null;
        if (objects != null) {
            if (objects[0].getClass().equals(element.getClass())) {
                int len = objects.length;
                newObjs = new Object[len + 1];
                System.arraycopy(objects, 0, newObjs, 0, index);
                newObjs[index] = element;
                System.arraycopy(objects, index, newObjs, index, len - index);
            }
        } else {
            newObjs = new Object[1];
            newObjs[0] = element;
        }
        return newObjs;
    }


}
