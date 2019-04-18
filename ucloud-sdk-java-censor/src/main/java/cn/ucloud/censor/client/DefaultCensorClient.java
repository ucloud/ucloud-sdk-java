package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateAsyncVideoTaskParam;
import cn.ucloud.censor.model.CreateAsyncVideoTaskResult;
import cn.ucloud.censor.model.CreateImageTaskParam;
import cn.ucloud.censor.model.CreateImageTaskResult;
import cn.ucloud.censor.model.CreateSyncVideoTaskParam;
import cn.ucloud.censor.model.CreateSyncVideoTaskResult;
import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.DeleteUAICensorResourceParam;
import cn.ucloud.censor.model.DeleteUAICensorResourceResult;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultParam;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultResult;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeParam;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeResult;
import cn.ucloud.censor.model.GetUAICensorResourceListParam;
import cn.ucloud.censor.model.GetUAICensorResourceListResult;
import cn.ucloud.censor.model.GetUAICensorResourceMetricInfoParam;
import cn.ucloud.censor.model.GetUAICensorResourceMetricInfoResult;
import cn.ucloud.censor.model.GetUAICensorResourceRecordInfoParam;
import cn.ucloud.censor.model.GetUAICensorResourceRecordInfoResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceNameParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceNameResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceOssInfoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceOssInfoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.http.UcloudRestHttp;
import cn.ucloud.common.http.UcloudRestHttpImpl;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 10:49
 **/
public class DefaultCensorClient extends DefaultUcloudClient implements CensorClient {

    private CensorConfig config;

    public DefaultCensorClient(CensorConfig config) {
        super(config);
        this.config = config;
    }

    @Override
    public GetUAICensorResourceMetricInfoResult
    getUAICensorResourceMetricInfo(GetUAICensorResourceMetricInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceMetricInfoResult.class);
        return (GetUAICensorResourceMetricInfoResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorResourceMetricInfo(GetUAICensorResourceMetricInfoParam param,
                                               UcloudHandler<GetUAICensorResourceMetricInfoResult> handler,
                                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceMetricInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAICensorResourceRecordInfoResult
    getUAICensorResourceRecordInfo(GetUAICensorResourceRecordInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceRecordInfoResult.class);
        return (GetUAICensorResourceRecordInfoResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorResourceRecordInfo(GetUAICensorResourceRecordInfoParam param,
                                               UcloudHandler<GetUAICensorResourceRecordInfoResult> handler,
                                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceRecordInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSyncVideoTaskResult
    createSyncVideoTask(CreateSyncVideoTaskParam param) throws Exception {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateSyncVideoTaskResult.class);
        return (CreateSyncVideoTaskResult) http.doPost(param, config,
                CensorConfig.CREATE_SYNC_VIDEO_CENSOR_TASK_ADDR,
                null);
    }

    @Override
    public void createSyncVideoTask(CreateSyncVideoTaskParam param,
                                    UcloudHandler<CreateSyncVideoTaskResult> handler,
                                    Boolean... asyncFlag) {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateSyncVideoTaskResult.class);
        try {
            http.doPost(param, config, CensorConfig.CREATE_SYNC_VIDEO_CENSOR_TASK_ADDR,
                    handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetAsyncVideoTaskResultResult
    getAsyncVideoTaskResult(GetAsyncVideoTaskResultParam param) throws Exception {
        UcloudRestHttp http = new UcloudRestHttpImpl(GetAsyncVideoTaskResultResult.class);
        return (GetAsyncVideoTaskResultResult) http.doGet(param, config,
                CensorConfig.QUERY_ASYNC_VIDEO_CENSOR_TASK_RESULT_ADDR,
                null);
    }

    @Override
    public void getAsyncVideoTaskResult(GetAsyncVideoTaskResultParam param,
                                        UcloudHandler<GetAsyncVideoTaskResultResult> handler,
                                        Boolean... asyncFlag) {
        UcloudRestHttp http = new UcloudRestHttpImpl(GetAsyncVideoTaskResultResult.class);
        try {
            http.doGet(param, config, CensorConfig.QUERY_ASYNC_VIDEO_CENSOR_TASK_RESULT_ADDR,
                    handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateAsyncVideoTaskResult
    createAsyncVideoTask(CreateAsyncVideoTaskParam param) throws Exception {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateAsyncVideoTaskResult.class);
        return (CreateAsyncVideoTaskResult) http.doPost(param, config,
                CensorConfig.CREATE_ASYNC_VIDEO_CENSOR_TASK_ADDR,
                null);
    }

    @Override
    public void
    createAsyncVideoTask(CreateAsyncVideoTaskParam param,
                         UcloudHandler<CreateAsyncVideoTaskResult> handler,
                         Boolean... asyncFlag) {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateAsyncVideoTaskResult.class);
        try {
            http.doPost(param, config, CensorConfig.CREATE_ASYNC_VIDEO_CENSOR_TASK_ADDR,
                    handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateImageTaskResult
    createImageTask(CreateImageTaskParam param) throws Exception {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateImageTaskResult.class);
        return (CreateImageTaskResult) http.doPost(param, config, CensorConfig.CREATE_IMAGE_CENSOR_TASK_ADDR,
                null);
    }

    @Override
    public void createImageTask(CreateImageTaskParam param,
                                UcloudHandler<CreateImageTaskResult>
                                        handler, Boolean... asyncFlag) {
        UcloudRestHttp http = new UcloudRestHttpImpl(CreateImageTaskResult.class);
        try {
            http.doPost(param, config, CensorConfig.CREATE_IMAGE_CENSOR_TASK_ADDR,
                    handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAICensorResourceOssInfoResult
    modifyUAICensorResourceOssInfo(ModifyUAICensorResourceOssInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceOssInfoResult.class);
        return (ModifyUAICensorResourceOssInfoResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUAICensorResourceOssInfo(ModifyUAICensorResourceOssInfoParam param,
                                               UcloudHandler<ModifyUAICensorResourceOssInfoResult> handler,
                                               Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceOssInfoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteUAICensorResourceResult
    deleteUAICensorResource(DeleteUAICensorResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAICensorResourceResult.class);
        return (DeleteUAICensorResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteUAICensorResource(DeleteUAICensorResourceParam param,
                                        UcloudHandler<DeleteUAICensorResourceResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAICensorResourceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAICensorResourceNameResult
    modifyUAICensorResourceName(ModifyUAICensorResourceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceNameResult.class);
        return (ModifyUAICensorResourceNameResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUAICensorResourceName(ModifyUAICensorResourceNameParam param,
                                            UcloudHandler<ModifyUAICensorResourceNameResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceNameResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAICensorResourceMemoResult
    modifyUAICensorResourceMemo(ModifyUAICensorResourceMemoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceMemoResult.class);
        return (ModifyUAICensorResourceMemoResult) http.doGet(param, config, null);
    }

    @Override
    public void modifyUAICensorResourceMemo(ModifyUAICensorResourceMemoParam param,
                                            UcloudHandler<ModifyUAICensorResourceMemoResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAICensorResourceMemoResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAICensorResourceListResult
    getUAICensorResourceList(GetUAICensorResourceListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceListResult.class);
        return (GetUAICensorResourceListResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorResourceList(GetUAICensorResourceListParam param,
                                         UcloudHandler<GetUAICensorResourceListResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorResourceListResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUAICensorResourceResult
    createUAICensorResource(CreateUAICensorResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUAICensorResourceResult.class);
        return (CreateUAICensorResourceResult) http.doGet(param, config, null);
    }

    @Override
    public void createUAICensorResource(CreateUAICensorResourceParam param,
                                        UcloudHandler<CreateUAICensorResourceResult> handler,
                                        Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAICensorAvailResourceTypeResult
    getUAICensorAvailResourceType(GetUAICensorAvailResourceTypeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        return (GetUAICensorAvailResourceTypeResult) http.doGet(param, config, null);
    }

    @Override
    public void getUAICensorAvailResourceType(GetUAICensorAvailResourceTypeParam param,
                                              UcloudHandler<GetUAICensorAvailResourceTypeResult> handler,
                                              Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAICensorAvailResourceTypeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
