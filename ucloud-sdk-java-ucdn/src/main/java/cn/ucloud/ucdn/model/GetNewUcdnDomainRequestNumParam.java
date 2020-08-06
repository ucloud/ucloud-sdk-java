package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * @description: 获取域名请求数 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:59
 */
public class GetNewUcdnDomainRequestNumParam extends BaseRequestParam {
    /**
     * 时间粒度（0表示按照5分钟粒度，1表示按照1小时粒度，2表示按照一天的粒度）
     */
    @UcloudParam("Type")
    @NotNull(message = "Type can not be empty")
    private Integer type;

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

    /**
     * 查询带宽区域 cn代表国内 abroad代表海外 不填默认为全部区域
     */
    @UcloudParam("Areacode")
    private String areaCode;

    /**
     * 查询的起始时间，格式为Unix Timestamp。如果有EndTime，BeginTime必须赋值。
     * 如没有赋值，则返回缺少参 数错误，如果没有EndTime，BeginTime也可以不赋值，EndTime默认当前时间，BeginTime 默认前一天的当前时间。
     */
    @UcloudParam("BeginTime")
    private Long beginTime;

    /**
     * 查询的结束时间，格式为Unix Timestamp。EndTime默认为当前时间，BeginTime默认为当前时间前一天时间。
     */
    @UcloudParam("EndTime")
    private Long endTime;

    public GetNewUcdnDomainRequestNumParam(@NotNull(message = "Type can not be null") Integer type) {
        super("GetNewUcdnDomainRequestNum");
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
