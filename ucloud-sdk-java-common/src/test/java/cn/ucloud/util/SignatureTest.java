package cn.ucloud.util;

import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.Param;
import com.sun.xml.internal.messaging.saaj.util.Base64;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-12 22:22
 **/
public class SignatureTest {

    @Before
    public void initGlobalAccount(){
        Signature.setGlobalAccount(new Account("46f09bb9fab4f12dfc160dae12273d5332b5debe",
                "ucloudsomeone@example.com1296235120854146120","UCloud.cn"));
    }

    public  Param[] initParams() {
        Param[] params = {
                new Param("Action", "CreateUHostInstance"),
                new Param("Region", "cn-bj2"),
                new Param("Zone", "cn-bj2-04"),
                new Param("ImageId", "f43736e1-65a5-4bea-ad2e-8a46e18883c2"),
                new Param("CPU", 2),
                new Param("Memory", 2048),
                new Param("DiskSpace", 10),
                new Param("LoginMode", "Password"),
                new Param("Password", Signature.getGlobalAccount().getPassword()),
                new Param("Name", "Host01"),
                new Param("ChargeType", "Month"),
                new Param("Quantity", 1),
                new Param("PublicKey", Signature.getGlobalAccount().getPublicKey()),};
       return params;
    }

    @Test
    public void getSignature() {
        Param[] params = initParams();
        assertEquals("签名失败","4f9ef5df2abab2c6fccd1e9515cb7e2df8c6bb65",Signature.getSignature(params));
    }

    @Test
    public void getParamAfterSignature() {
        Param[] params = initParams();
        Param[] paramAfterSignature = Signature.getParamAfterSignature(params);
        int len = paramAfterSignature.length;
        for (int i =0 ;i<len;i++){
            System.out.println(paramAfterSignature[i].getParamKey()+"==="+paramAfterSignature[i].getParamValue());
        }
    }
}