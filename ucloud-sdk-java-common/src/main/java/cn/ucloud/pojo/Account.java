package cn.ucloud.pojo;

import com.sun.xml.internal.messaging.saaj.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @description: 账户
 * @author: codezhang
 * @date: 2018-09-12 18:44
 **/

public class Account {

    private String privateKey;
    private String publicKey;
    private String password;

    public Account(String privateKey, String publicKey, String password) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        try {
            this.password = new String(Base64.encode((password).getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
