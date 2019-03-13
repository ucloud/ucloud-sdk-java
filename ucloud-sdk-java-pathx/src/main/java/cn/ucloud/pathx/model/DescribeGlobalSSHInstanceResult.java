package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取GlobalSSH实例列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeGlobalSSHInstanceResult extends BaseResponseResult {
    /**
     * GlobalSSH实例列表，实例的属性参考GlobalSSHInfo模型
     */
    @SerializedName("InstanceSet")
    private List<GlobalSSHInfo> instanceSet;


    public List<GlobalSSHInfo> getInstanceSet() {
        return this.instanceSet;
    }

    public void setInstanceSet(List<GlobalSSHInfo> instanceSet) {
        this.instanceSet = instanceSet;
    }


}