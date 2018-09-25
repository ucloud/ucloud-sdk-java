package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.Gson;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 15:52
 */
public class RecoverUDiskResult extends BaseResponseResult {

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
