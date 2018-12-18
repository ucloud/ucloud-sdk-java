package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 路由策略增、删、改 参数类
 * @author: codezhang
 * @date: 2018-09-21 19:38
 **/

public class ModifyRouteRuleParam extends BaseRequestParam {

    public static class RouteRule {

        /**
         * rule id
         */
        private String routeRuleId;

        /**
         * 目的网段
         */
        private String targetSegment;

        /**
         * 下一跳类型为instance或者vip
         */
        private String nextJumpType;

        /**
         * 下一跳为云主机id或者vip的id
         */
        private String nextJump;

        /**
         * 优先级 优先级使用0
         */
        private Integer priority;

        /**
         * 备注
         */
        private String remark;

        /**
         * 动作标志为add/delete/update
         */
        private String flag;

        public RouteRule(String routeRuleId, String targetSegment, String nextJumpType, String nextJump, Integer priority, String remark, String flag) {
            this.routeRuleId = routeRuleId;
            this.targetSegment = targetSegment;
            this.nextJumpType = nextJumpType;
            this.nextJump = nextJump;
            this.priority = priority;
            this.remark = remark;
            this.flag = flag;
        }

        public String getRouteRuleId() {
            return routeRuleId;
        }

        public void setRouteRuleId(String routeRuleId) {
            this.routeRuleId = routeRuleId;
        }

        public String getTargetSegment() {
            return targetSegment;
        }

        public void setTargetSegment(String targetSegment) {
            this.targetSegment = targetSegment;
        }

        public String getNextJumpType() {
            return nextJumpType;
        }

        public void setNextJumpType(String nextJumpType) {
            this.nextJumpType = nextJumpType;
        }

        public String getNextJump() {
            return nextJump;
        }

        public void setNextJump(String nextJump) {
            this.nextJump = nextJump;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }
    }


    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 路由表ID 通过DescribeRouteTable拿到
     */
    @UcloudParam("RouteTableId")
    @NotEmpty(message = "routeTableId can not be empty")
    private String routeTableId;


    /**
     * 路由规则
     */
    private List<RouteRule> routeRules;

    @UcloudParam("RouteRules")
    public List<Param> checkRouteRules() throws Exception {
        List<Param> list = new ArrayList<>();
        if (routeRules == null) {
            throw new ValidationException("routeRules can not be null");
        } else {
            int len = routeRules.size();
            if (len <= 0) {
                throw new ValidationException("routeRules can not be empty");
            } else {
                for (int i = 0; i < len; i++) {
                    RouteRule routeRule = routeRules.get(i);
                    StringBuilder builder = new StringBuilder();
                    if (routeRule.routeRuleId == null || routeRule.routeRuleId.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].routeRuleId can not be empty");
                    }
                    builder.append(routeRule.routeRuleId + "|");
                    if (routeRule.targetSegment == null || routeRule.targetSegment.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].targetSegment can not be empty");
                    }
                    builder.append(routeRule.targetSegment + "|");
                    if (routeRule.nextJumpType == null || routeRule.nextJumpType.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].nextJumpType can not be empty");
                    }
                    builder.append(routeRule.nextJumpType + "|");
                    if (routeRule.nextJump == null || routeRule.nextJump.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].nextJump can not be empty");
                    }
                    builder.append(routeRule.nextJump + "|");
                    if (routeRule.priority == null) {
                        throw new ValidationException("routeRule[" + i + "].priority can not be empty");
                    }
                    builder.append(routeRule.priority + "|");
                    if (routeRule.remark == null || routeRule.remark.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].remark can not be empty");
                    }
                    builder.append(routeRule.remark + "|");
                    if (routeRule.flag == null || routeRule.flag.length() <= 0) {
                        throw new ValidationException("routeRule[" + i + "].flag can not be empty");
                    }
                    builder.append(routeRule.flag);
                    list.add(new Param("RouteRule." + i, builder.toString()));
                }
            }
        }
        return list;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public List<RouteRule> getRouteRules() {
        return routeRules;
    }

    public void setRouteRules(List<RouteRule> routeRules) {
        this.routeRules = routeRules;
    }

    public ModifyRouteRuleParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotEmpty(message = "routeTableId can not be empty") String routeTableId) {
        super("ModifyRouteRule");
        this.region = region;
        this.routeTableId = routeTableId;
    }

}
