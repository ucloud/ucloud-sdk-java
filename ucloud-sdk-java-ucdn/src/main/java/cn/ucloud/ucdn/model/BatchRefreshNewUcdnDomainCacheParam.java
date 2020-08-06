package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 批量刷新缓存 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:40
 */
public class BatchRefreshNewUcdnDomainCacheParam extends BaseRequestParam {
    /**
     * 刷新类型，file代表文件刷新，dir 代表路径刷新
     */
    @UcloudParam("Type")
    @NotEmpty(message = "Type can not be empty")
    private String type;

    /**
     * 待刷新URL列表，以JSON格式描述。刷新多个URL列表时，一次最多提交1000个。
     * 每个域名必须以”http://域名/”开始。目录要以”/”结尾， 如刷新目录a下所有文件，格式为：http://abc.ucloud.cn/a/；
     * 如刷新文件目录a下面所有img.png文件， 格式为http://abc.ucloud.cn/a/img.png。请正确提交需要刷新的域名
     */
    @UcloudParam("UrlList")
    @NotEmpty(message = "UrlList can not be empty")
    private String urlList;

    public BatchRefreshNewUcdnDomainCacheParam() {
        super("BatchRefreshNewUcdnDomainCache");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrlList() {
        return urlList;
    }

    public void setUrlList(String urlList) {
        this.urlList = urlList;
    }
}
