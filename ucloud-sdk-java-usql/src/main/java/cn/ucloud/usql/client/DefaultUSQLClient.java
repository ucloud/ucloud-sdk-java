package cn.ucloud.usql.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.usql.model.*;
import cn.ucloud.usql.pojo.USQLConfig;

/**
 * @Description : USQL 默认客户端接口实现
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DefaultUSQLClient extends DefaultUcloudClient implements USQLClient {
    public DefaultUSQLClient(USQLConfig config) {
        super(config);
    }

    @Override
    public UpdateUSQLSettingResult updateUSQLSetting(UpdateUSQLSettingParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateUSQLSettingResult.class);
        return (UpdateUSQLSettingResult) http.doGet(param, config, null);
    }

    @Override
    public void updateUSQLSetting(UpdateUSQLSettingParam param,
                                  UcloudHandler<UpdateUSQLSettingResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateUSQLSettingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUSQLSettingResult getUSQLSetting(GetUSQLSettingParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUSQLSettingResult.class);
        return (GetUSQLSettingResult) http.doGet(param, config, null);
    }

    @Override
    public void getUSQLSetting(GetUSQLSettingParam param,
                               UcloudHandler<GetUSQLSettingResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUSQLSettingResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CancelSQLQueryResult cancelSQLQuery(CancelSQLQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CancelSQLQueryResult.class);
        return (CancelSQLQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void cancelSQLQuery(CancelSQLQueryParam param,
                               UcloudHandler<CancelSQLQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CancelSQLQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RemoveTokenForUSQLResult removeTokenForUSQL(RemoveTokenForUSQLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RemoveTokenForUSQLResult.class);
        return (RemoveTokenForUSQLResult) http.doGet(param, config, null);
    }

    @Override
    public void removeTokenForUSQL(RemoveTokenForUSQLParam param,
                                   UcloudHandler<RemoveTokenForUSQLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RemoveTokenForUSQLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListTokensForUSQLResult listTokensForUSQL(ListTokensForUSQLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListTokensForUSQLResult.class);
        return (ListTokensForUSQLResult) http.doGet(param, config, null);
    }

    @Override
    public void listTokensForUSQL(ListTokensForUSQLParam param,
                                  UcloudHandler<ListTokensForUSQLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListTokensForUSQLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetSQLQueryDataURLResult getSQLQueryDataURL(GetSQLQueryDataURLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryDataURLResult.class);
        return (GetSQLQueryDataURLResult) http.doGet(param, config, null);
    }

    @Override
    public void getSQLQueryDataURL(GetSQLQueryDataURLParam param,
                                   UcloudHandler<GetSQLQueryDataURLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryDataURLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteCatalogDatabaseResult deleteCatalogDatabase(DeleteCatalogDatabaseParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteCatalogDatabaseResult.class);
        return (DeleteCatalogDatabaseResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteCatalogDatabase(DeleteCatalogDatabaseParam param,
                                      UcloudHandler<DeleteCatalogDatabaseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteCatalogDatabaseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetCatalogTableResult getCatalogTable(GetCatalogTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogTableResult.class);
        return (GetCatalogTableResult) http.doGet(param, config, null);
    }

    @Override
    public void getCatalogTable(GetCatalogTableParam param,
                                UcloudHandler<GetCatalogTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AddTokenForUSQLResult addTokenForUSQL(AddTokenForUSQLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddTokenForUSQLResult.class);
        return (AddTokenForUSQLResult) http.doGet(param, config, null);
    }

    @Override
    public void addTokenForUSQL(AddTokenForUSQLParam param,
                                UcloudHandler<AddTokenForUSQLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddTokenForUSQLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListNamedQueriesResult listNamedQueries(ListNamedQueriesParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListNamedQueriesResult.class);
        return (ListNamedQueriesResult) http.doGet(param, config, null);
    }

    @Override
    public void listNamedQueries(ListNamedQueriesParam param,
                                 UcloudHandler<ListNamedQueriesResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListNamedQueriesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListUSQLTokensResult listUSQLTokens(ListUSQLTokensParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListUSQLTokensResult.class);
        return (ListUSQLTokensResult) http.doGet(param, config, null);
    }

    @Override
    public void listUSQLTokens(ListUSQLTokensParam param,
                               UcloudHandler<ListUSQLTokensResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListUSQLTokensResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateNamedQueryResult createNamedQuery(CreateNamedQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateNamedQueryResult.class);
        return (CreateNamedQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void createNamedQuery(CreateNamedQueryParam param,
                                 UcloudHandler<CreateNamedQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateNamedQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetNamedQueryResult getNamedQuery(GetNamedQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetNamedQueryResult.class);
        return (GetNamedQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void getNamedQuery(GetNamedQueryParam param,
                              UcloudHandler<GetNamedQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetNamedQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RemoveUSQLTokenResult removeUSQLToken(RemoveUSQLTokenParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RemoveUSQLTokenResult.class);
        return (RemoveUSQLTokenResult) http.doGet(param, config, null);
    }

    @Override
    public void removeUSQLToken(RemoveUSQLTokenParam param,
                                UcloudHandler<RemoveUSQLTokenResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RemoveUSQLTokenResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public EnableUSQLTokenResult enableUSQLToken(EnableUSQLTokenParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(EnableUSQLTokenResult.class);
        return (EnableUSQLTokenResult) http.doGet(param, config, null);
    }

    @Override
    public void enableUSQLToken(EnableUSQLTokenParam param,
                                UcloudHandler<EnableUSQLTokenResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(EnableUSQLTokenResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteNamedQueryResult.class);
        return (DeleteNamedQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteNamedQuery(DeleteNamedQueryParam param,
                                 UcloudHandler<DeleteNamedQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteNamedQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteCatalogTableResult deleteCatalogTable(DeleteCatalogTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteCatalogTableResult.class);
        return (DeleteCatalogTableResult) http.doGet(param, config, null);
    }

    @Override
    public void deleteCatalogTable(DeleteCatalogTableParam param,
                                   UcloudHandler<DeleteCatalogTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteCatalogTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListSQLQueriesResult listSQLQueries(ListSQLQueriesParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListSQLQueriesResult.class);
        return (ListSQLQueriesResult) http.doGet(param, config, null);
    }

    @Override
    public void listSQLQueries(ListSQLQueriesParam param,
                               UcloudHandler<ListSQLQueriesResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListSQLQueriesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetCatalogDatabaseResult getCatalogDatabase(GetCatalogDatabaseParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogDatabaseResult.class);
        return (GetCatalogDatabaseResult) http.doGet(param, config, null);
    }

    @Override
    public void getCatalogDatabase(GetCatalogDatabaseParam param,
                                   UcloudHandler<GetCatalogDatabaseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogDatabaseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AddUSQLTokenResult addUSQLToken(AddUSQLTokenParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddUSQLTokenResult.class);
        return (AddUSQLTokenResult) http.doGet(param, config, null);
    }

    @Override
    public void addUSQLToken(AddUSQLTokenParam param,
                             UcloudHandler<AddUSQLTokenResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddUSQLTokenResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateCatalogDatabaseResult createCatalogDatabase(CreateCatalogDatabaseParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateCatalogDatabaseResult.class);
        return (CreateCatalogDatabaseResult) http.doGet(param, config, null);
    }

    @Override
    public void createCatalogDatabase(CreateCatalogDatabaseParam param,
                                      UcloudHandler<CreateCatalogDatabaseResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateCatalogDatabaseResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUSQLServiceResult getUSQLService(GetUSQLServiceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUSQLServiceResult.class);
        return (GetUSQLServiceResult) http.doGet(param, config, null);
    }

    @Override
    public void getUSQLService(GetUSQLServiceParam param,
                               UcloudHandler<GetUSQLServiceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUSQLServiceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListCatalogDatabasesResult listCatalogDatabases(ListCatalogDatabasesParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogDatabasesResult.class);
        return (ListCatalogDatabasesResult) http.doGet(param, config, null);
    }

    @Override
    public void listCatalogDatabases(ListCatalogDatabasesParam param,
                                     UcloudHandler<ListCatalogDatabasesResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogDatabasesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public RunSQLQueryResult runSQLQuery(RunSQLQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(RunSQLQueryResult.class);
        return (RunSQLQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void runSQLQuery(RunSQLQueryParam param,
                            UcloudHandler<RunSQLQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(RunSQLQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public OpenUSQLServiceResult openUSQLService(OpenUSQLServiceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(OpenUSQLServiceResult.class);
        return (OpenUSQLServiceResult) http.doGet(param, config, null);
    }

    @Override
    public void openUSQLService(OpenUSQLServiceParam param,
                                UcloudHandler<OpenUSQLServiceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(OpenUSQLServiceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateCatalogTableResult createCatalogTable(CreateCatalogTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateCatalogTableResult.class);
        return (CreateCatalogTableResult) http.doGet(param, config, null);
    }

    @Override
    public void createCatalogTable(CreateCatalogTableParam param,
                                   UcloudHandler<CreateCatalogTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateCatalogTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetSQLQueryResult getSQLQuery(GetSQLQueryParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryResult.class);
        return (GetSQLQueryResult) http.doGet(param, config, null);
    }

    @Override
    public void getSQLQuery(GetSQLQueryParam param,
                            UcloudHandler<GetSQLQueryResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetSQLQueryDataResult getSQLQueryData(GetSQLQueryDataParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryDataResult.class);
        return (GetSQLQueryDataResult) http.doGet(param, config, null);
    }

    @Override
    public void getSQLQueryData(GetSQLQueryDataParam param,
                                UcloudHandler<GetSQLQueryDataResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetSQLQueryDataResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListCatalogTablesResult listCatalogTables(ListCatalogTablesParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogTablesResult.class);
        return (ListCatalogTablesResult) http.doGet(param, config, null);
    }

    @Override
    public void listCatalogTables(ListCatalogTablesParam param,
                                  UcloudHandler<ListCatalogTablesResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogTablesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetCatalogTableDDLResult getCatalogTableDDL(GetCatalogTableDDLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogTableDDLResult.class);
        return (GetCatalogTableDDLResult) http.doGet(param, config, null);
    }

    @Override
    public void getCatalogTableDDL(GetCatalogTableDDLParam param,
                                   UcloudHandler<GetCatalogTableDDLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetCatalogTableDDLResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ListCatalogTablePropertiesResult listCatalogTableProperties(ListCatalogTablePropertiesParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogTablePropertiesResult.class);
        return (ListCatalogTablePropertiesResult) http.doGet(param, config, null);
    }

    @Override
    public void listCatalogTableProperties(ListCatalogTablePropertiesParam param,
                                           UcloudHandler<ListCatalogTablePropertiesResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ListCatalogTablePropertiesResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}