package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 13:48
 */
public class BatchDescribeNewUcdnDomainParam extends BaseRequestParam {

    /**
     * 数据偏移量，默认0，非负整数
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * 返回数据长度，如果制定了Offset，则默认20，否则默认全部，非负整数
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 渠道ucdn、ufile、uvideo
     */
    @UcloudParam("ChannelType")
    private String channelType;

    /**
     * 域名id，创建域名时生成的资源id，默认获取账号下的所有域名信息，n为自然数
     */
    private List<String> domainIds;

    @UcloudParam("DomainId")
    public List<Param> checkDomainIds() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (domainIds == null || domainIds.isEmpty()) {
            throw new ValidationException("domainIds can not be empty");
        } else {
            for (int i = 0, len = domainIds.size(); i < len; i++) {
                if (domainIds.get(i) == null || domainIds.get(i).length() < 1) {
                    throw new ValidationException(String.format("domainIds[%d] can not be empty", i));
                } else {
                    Param param = new Param(String.format("DomainId.%d", i), domainIds.get(i));
                    list.add(param);
                }
            }
        }
        return list;
    }

    protected BatchDescribeNewUcdnDomainParam() {
        super("BatchDescribeNewUcdnDomain");
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }
}
