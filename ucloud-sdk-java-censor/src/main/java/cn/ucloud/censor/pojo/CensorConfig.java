package cn.ucloud.censor.pojo;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;

/**
 * @Description : censor 配置类
 * @Author : codezhang
 * @Date : 2019-04-17 10:39
 **/
public class CensorConfig extends UcloudConfig {


    private static final String CENSOR_API_ADDR = "http://api.uai.ucloud.cn/";

    private static final String CENSOR_VERSION = "v1";

    public static final String CREATE_IMAGE_CENSOR_TASK_ADDR
            = CENSOR_API_ADDR + CENSOR_VERSION + "/image/scan";

    public static final String CREATE_ASYNC_VIDEO_CENSOR_TASK_ADDR
            = CENSOR_API_ADDR + CENSOR_VERSION + "/video/asyncscan";

    public static final String QUERY_ASYNC_VIDEO_CENSOR_TASK_RESULT_ADDR
            = CENSOR_API_ADDR + CENSOR_VERSION + "/video/asyncscan";

    public static final String CREATE_SYNC_VIDEO_CENSOR_TASK_ADDR
            = CENSOR_API_ADDR + CENSOR_VERSION + "/video/syncscan";

    public CensorConfig(Account account) {
        super(account);
    }
}
