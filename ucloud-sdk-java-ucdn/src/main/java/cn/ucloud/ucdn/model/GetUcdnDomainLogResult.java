package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取加速域名原始日志 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:12
 */
public class GetUcdnDomainLogResult extends BaseResponseResult {
    /**
     * 获取日志的连接地址。具体参考{@link LogSet}
     */
    @SerializedName("LogSet")
    private List<LogSet> logSet;

    public List<LogSet> getLogSet() {
        return logSet;
    }

    public void setLogSet(List<LogSet> logSet) {
        this.logSet = logSet;
    }
}
