package cn.ucloud.common.util;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.Param;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-12 22:22
 **/
public class SignatureTest {

    private Account account;

    @Before
    public void initGlobalAccount(){
        account = new Account("46f09bb9fab4f12dfc160dae12273d5332b5debe",
                "ucloudsomeone@example.com1296235120854146120");
    }

    public  Param[] initParamsArray() {
        Param[] params = {
                new Param("Action", "CreateUHostInstance"),
                new Param("Region", "cn-bj2"),
                new Param("Zone", "cn-bj2-04"),
                new Param("ImageId", "f43736e1-65a5-4bea-ad2e-8a46e18883c2"),
                new Param("CPU", 2),
                new Param("Memory", 2048),
                new Param("DiskSpace", 10),
                new Param("LoginMode", "Password"),
                new Param("Password", "aaaa"),
                new Param("Name", "Host01"),
                new Param("ChargeType", "Month"),
                new Param("Quantity", 1),
                new Param("PublicKey", account.getPublicKey()),};
       return params;
    }

    public List<Param> initParamsList() {
        List<Param> params = new ArrayList<>();
        params.add(new Param("Action", "CreateUHostInstance"));
        params.add(new Param("Region", "cn-bj2"));
        params.add(new Param("Zone", "cn-bj2-04"));
        params.add(new Param("ImageId", "f43736e1-65a5-4bea-ad2e-8a46e18883c2"));
        params.add(new Param("CPU", 2));
        params.add(new Param("Memory", 2048));
        params.add(new Param("DiskSpace", 10));
        params.add(new Param("LoginMode", "Password"));
        params.add(new Param("Password", "aaa"));
        params.add(new Param("Name", "Host01"));
        params.add(new Param("ChargeType", "Month"));
        params.add(new Param("Quantity", 1));
        params.add(new Param("PublicKey", account.getPublicKey()));
        return params;
    }

    @Test
    public void getSignatureArray() {
        Param[] params = initParamsArray();
        System.out.println(Signature.getSignature(params,account));
    }
    @Test
    public void getSignatureLsit() {
        List<Param> list =  new ArrayList<>(initParamsList());
        System.out.println(Signature.getSignature(list,account));
    }


    @Test
    public void getParamArrayAfterSignature() {
        Param[] params = initParamsArray();
        Param[] paramAfterSignature = Signature.getParamAfterSignature(params,account);
        int len = paramAfterSignature.length;
        for (int i =0 ;i<len;i++){
            System.out.println(paramAfterSignature[i].getParamKey()+"==="+paramAfterSignature[i].getParamValue());
        }
    }

    @Test
    public void getParamListAfterSignature() {
        List<Param> params = initParamsList();
        params = Signature.getParamAfterSignature(params,account);
        for (Param param:params){
            System.out.println(param.getParamKey()+"==="+param.getParamValue());
        }
    }
}