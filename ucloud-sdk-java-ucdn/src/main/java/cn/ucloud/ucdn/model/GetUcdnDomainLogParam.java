package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * @description: 获取加速域名原始日志 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:59
 */
public class GetUcdnDomainLogParam extends BaseRequestParam {
    /**
     * 查询粒度 0=default(没有粒度) 1=按小时 2=按天
     */
    @UcloudParam("Type")
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
     * 查询的起始时间，格式为Unix Timestamp。如果有EndTime，BeginTime必须赋值。
     */
    @UcloudParam("BeginTime")
    private Long beginTime;

    /**
     * 查询的结束时间，格式为Unix Timestamp。EndTime默认为当前时间，BeginTime默认为当前时间前一天时间。
     */
    @UcloudParam("EndTime")
    private Long endTime;

    public GetUcdnDomainLogParam() {
        super("GetUcdnDomainLog");
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
