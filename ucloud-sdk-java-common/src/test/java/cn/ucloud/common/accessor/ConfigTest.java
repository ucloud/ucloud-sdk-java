package cn.ucloud.common.accessor;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.exception.RetCodeException;
import cn.ucloud.common.exception.ValidatorException;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;

public class ConfigTest {

    @Test
    public void testCaseConfigAccessor() {
        Config cfg = new Config();

        String baseUrl = "https://api.ucloud.cn";
        cfg.setBaseUrl(baseUrl);
        Assert.assertEquals(baseUrl, cfg.getBaseUrl());

        String region = "cn-bj2";
        cfg.setRegion(region);
        Assert.assertEquals(region, cfg.getRegion());

        String projectId = "org-xxx";
        cfg.setProjectId(projectId);
        Assert.assertEquals(projectId, cfg.getProjectId());

        String userAgent = "Demo/0.42";
        cfg.setUserAgent(userAgent);
        Assert.assertEquals(userAgent, cfg.getUserAgent());

        Integer timeout = 1;
        cfg.setTimeout(timeout);
        Assert.assertEquals(timeout, cfg.getTimeout());

        Integer maxRetries = 1;
        cfg.setMaxRetries(maxRetries);
        Assert.assertEquals(maxRetries, cfg.getMaxRetries());

        Logger logger = null;
        cfg.setLogger(logger);
        Assert.assertEquals(logger, cfg.getLogger());
    }

    @Test
    public void testException() {
        RetCodeException retCodeException = new RetCodeException(42, "", "");
        Assert.assertEquals(new Integer(42), retCodeException.getRetCode());
        Assert.assertEquals("", retCodeException.getRequestId());

        ValidatorException validatorException = new ValidatorException("");
        try {
            throw validatorException;
        } catch (ValidatorException e) {
            Assert.assertEquals(validatorException, e);
        }
    }
}
