package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * @description: 刷新缓存 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:59
 */
public class RefreshNewUcdnDomainCacheParam extends BaseRequestParam {

    /**
     * 刷新类型，file代表文件刷新，dir 代表路径刷新
     */
    @UcloudParam("Type")
    @NotEmpty(message = "Type can not be empty")
    private String type;

    /**
     * 预热URL列表，n从自然数0开始。UrlList.n字段必须以“http://域名/”开始。目录要以“/”结尾，
     * 如刷新目录a下所有文件，格式为：http://abc.ucloud.cn/a/；如刷新文件目录a下面img.png文件，格式为http://abc.ucloud.cn/a/img.png。
     * 请正确提交需要刷新的域名
     */
    @NotNull(message = "UrlList can not be null")
    private List<String> urlList;

    @UcloudParam("UrlList")
    public List<Param> checkUrlList() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (urlList == null || urlList.isEmpty()) {
            throw new ValidationException("urlList can not be empty");
        } else {
            for (int i = 0, len = urlList.size(); i < len; i++) {
                if (urlList.get(i) == null || urlList.get(i).length() < 1) {
                    throw new ValidationException(String.format("urlList[%d] can not be empty", i));
                } else {
                    Param param = new Param(String.format("UrlList.%d", i), urlList.get(i));
                    list.add(param);
                }
            }
        }
        return list;
    }

    public RefreshNewUcdnDomainCacheParam(@NotEmpty(message = "Type can not be empty") String type,
                                          @NotNull(message = "UrlList can not be null") List<String> urlList) {
        super("RefreshNewUcdnDomainCache");
        this.type = type;
        this.urlList = urlList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }
}
