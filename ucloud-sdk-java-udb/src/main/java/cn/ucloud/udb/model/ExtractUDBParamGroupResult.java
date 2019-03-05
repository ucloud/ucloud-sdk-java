package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取配置文件内容 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:17
 **/
public class ExtractUDBParamGroupResult extends BaseResponseResult {

    /**
     * 配置文件内容
     */
    @SerializedName("Content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
