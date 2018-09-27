package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取弹性IP信息 参数对象
 * @author: codezhang
 * @date: 2018-09-25 14:16
 **/

public class DescribeEIPParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 弹性IP的资源ID如果为空, 则返回当前 Region中符合条件的的所有EIP
     */
    private List<String> eipIds;

    @UcloudParam("EIP")
    public List<Param> checkEIPIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (eipIds != null) {
            int len = eipIds.size();
            for (int i = 0; i < len; i++) {
                String id = eipIds.get(i);
                if (id == null || id.length() <= 0){
                    throw new ValidationException("eipIds["+i+"] can not be empty");
                }
                list.add(new Param("EIPIds."+i,id));
            }
        }
        return list;
    }

    /**
     * optional 数据偏移量, 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional 数据分页值, 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribeEIPParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeEIP");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getEipIds() {
        return eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
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
}
