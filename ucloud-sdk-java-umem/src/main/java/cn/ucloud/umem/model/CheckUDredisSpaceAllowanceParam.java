package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 检查高性能UMem剩余资源 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class CheckUDredisSpaceAllowanceParam extends BaseRequestParam {
            /**
            * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
            */
            @UcloudParam("Region")
                    @NotEmpty(message = "region can not be empty")
                private String region;
            /**
            * 可用区。参见 [可用区列表](../summary/regionlist.html)
            */
            @UcloudParam("Zone")
                    @NotEmpty(message = "zone can not be empty")
                private String zone;
            /**
            * 创建实例的容量大小
            */
            @UcloudParam("Size")
                    @NotEmpty(message = "size can not be empty")
                private String size;
            /**
            * 创建实例的数量，[1-10]
            */
            @UcloudParam("Count")
                    @NotEmpty(message = "count can not be empty")
                private String count;


public CheckUDredisSpaceAllowanceParam(                    String region
                    ,String zone
                    ,String size
                    ,String count
){
super("CheckUDredisSpaceAllowance");
                this.region = region;
                this.zone = zone;
                this.size = size;
                this.count = count;
}


                public String getRegion() {
                return this.region;
                }

                public void setRegion(String region) {
                this.region = region;
                }
                public String getZone() {
                return this.zone;
                }

                public void setZone(String zone) {
                this.zone = zone;
                }
                public String getSize() {
                return this.size;
                }

                public void setSize(String size) {
                this.size = size;
                }
                public String getCount() {
                return this.count;
                }

                public void setCount(String count) {
                this.count = count;
                }


}