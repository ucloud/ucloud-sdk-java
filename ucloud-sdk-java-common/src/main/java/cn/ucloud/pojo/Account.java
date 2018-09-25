package cn.ucloud.pojo;

/**
 * @description: 账户
 * @author: codezhang
 * @date: 2018-09-12 18:44
 **/

public class Account {

    private String privateKey;
    private String publicKey;

    public Account(String privateKey, String publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
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
