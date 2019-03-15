package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 修改UPath监控告警项 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUPathTemplateParam extends BaseRequestParam {

    public static class Template {

        /**
         * 指标名称
         */
        private String metricName;

        /**
         * 告警阈值
         */
        private Integer threshold;

        /**
         * 连续告警间隔，单位：分钟 (5,10,15,525600)
         */
        private Integer alarmFrequency;

        /**
         * 告警组id
         */
        private Integer contactGroupId;

        /**
         * 比较方式[‘GE’,’LE’]
         */
        private String compare;

        /**
         * 收敛策略
         */
        private String alarmStrategy;

        /**
         * 连续触发次数
         */
        private Integer triggerCount;

        public Template(String metricName,
                        Integer threshold,
                        Integer alarmFrequency,
                        Integer contactGroupId,
                        String compare,
                        String alarmStrategy,
                        Integer triggerCount) {
            this.metricName = metricName;
            this.threshold = threshold;
            this.alarmFrequency = alarmFrequency;
            this.contactGroupId = contactGroupId;
            this.compare = compare;
            this.alarmStrategy = alarmStrategy;
            this.triggerCount = triggerCount;
        }

        public String getMetricName() {
            return metricName;
        }

        public void setMetricName(String metricName) {
            this.metricName = metricName;
        }

        public Integer getThreshold() {
            return threshold;
        }

        public void setThreshold(Integer threshold) {
            this.threshold = threshold;
        }

        public Integer getAlarmFrequency() {
            return alarmFrequency;
        }

        public void setAlarmFrequency(Integer alarmFrequency) {
            this.alarmFrequency = alarmFrequency;
        }

        public Integer getContactGroupId() {
            return contactGroupId;
        }

        public void setContactGroupId(Integer contactGroupId) {
            this.contactGroupId = contactGroupId;
        }

        public String getCompare() {
            return compare;
        }

        public void setCompare(String compare) {
            this.compare = compare;
        }

        public String getAlarmStrategy() {
            return alarmStrategy;
        }

        public void setAlarmStrategy(String alarmStrategy) {
            this.alarmStrategy = alarmStrategy;
        }

        public Integer getTriggerCount() {
            return triggerCount;
        }

        public void setTriggerCount(Integer triggerCount) {
            this.triggerCount = triggerCount;
        }
    }

    /**
     * 线路ID
     */
    @UcloudParam("UPathID")
    private String uPathID;

    private List<Template> templates;


    public ModifyUPathTemplateParam(String projectId,
                                    String uPathID
    ) {
        super("ModifyUPathTemplate");
        this.projectId = projectId;
        this.uPathID = uPathID;
    }

    @UcloudParam("Template")
    public List<Param> checkTemplates() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (templates != null) {
            int size = templates.size();
            for (int i = 0; i < size; i++) {
                Template template = templates.get(i);
                if (template == null){
                    throw new ValidationException(String.format("templates[%d] can not be null",i));
                }

                if (template.getMetricName() == null || template.getMetricName().length() <= 0){
                    throw new ValidationException(String.format("templates[%d].metricName can not be empty",i));
                }
                params.add(new Param(String.format("MetricName.%d",i),template.getMetricName()));

                if (template.getAlarmFrequency() == null){
                    throw new ValidationException(String.format("templates[%d].alarmFrequency can not be null",i));
                }
                params.add(new Param(String.format("AlarmFrequency.%d",i),template.getMetricName()));

                if (template.getAlarmStrategy() == null || template.getAlarmStrategy().length() <= 0){
                    throw new ValidationException(String.format("templates[%d].alarmStrategy can not be empty",i));
                }
                params.add(new Param(String.format("AlarmStrategy.%d",i),template.getMetricName()));

                if (template.getCompare() == null || template.getCompare().length()<=0){
                    throw new ValidationException(String.format("templates[%d].compare can not be empty",i));
                }
                params.add(new Param(String.format("Compare.%d",i),template.getMetricName()));

                if (template.getContactGroupId() == null){
                    throw new ValidationException(String.format("templates[%d].contactGroupId can not be null",i));
                }
                params.add(new Param(String.format("ContactGroupId.%d",i),template.getMetricName()));

                if (template.getThreshold() == null){
                    throw new ValidationException(String.format("templates[%d].threshold can not be null",i));
                }
                params.add(new Param(String.format("Threshold.%d",i),template.getMetricName()));

                if (template.getTriggerCount() == null){
                    throw new ValidationException(String.format("templates[%d].triggerCount can not be null",i));
                }
                params.add(new Param(String.format("TriggerCount.%d",i),template.getMetricName()));
            }
        }
        return params;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public String getuPathID() {
        return this.uPathID;
    }

    public void setuPathID(String uPathID) {
        this.uPathID = uPathID;
    }


}