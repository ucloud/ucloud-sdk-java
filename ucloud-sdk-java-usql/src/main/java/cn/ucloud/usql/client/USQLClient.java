package cn.ucloud.usql.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.usql.model.*;

/**
 * @Description : USQL 客户端接口
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public interface USQLClient extends UcloudClient {

    /**
     * 更新USQL设置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdateUSQLSettingResult updateUSQLSetting(
            UpdateUSQLSettingParam param) throws Exception;

    /**
     * 更新USQL设置 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updateUSQLSetting(UpdateUSQLSettingParam param,
                           UcloudHandler<UpdateUSQLSettingResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取用户USQL配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUSQLSettingResult getUSQLSetting(
            GetUSQLSettingParam param) throws Exception;

    /**
     * 获取用户USQL配置 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUSQLSetting(GetUSQLSettingParam param,
                        UcloudHandler<GetUSQLSettingResult> handler,
                        Boolean... asyncFlag);

    /**
     * 取消SQL查询
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CancelSQLQueryResult cancelSQLQuery(
            CancelSQLQueryParam param) throws Exception;

    /**
     * 取消SQL查询 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void cancelSQLQuery(CancelSQLQueryParam param,
                        UcloudHandler<CancelSQLQueryResult> handler,
                        Boolean... asyncFlag);

    /**
     * 获取SQL查询结果下载地址
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetSQLQueryDataURLResult getSQLQueryDataURL(
            GetSQLQueryDataURLParam param) throws Exception;

    /**
     * 获取SQL查询结果下载地址 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getSQLQueryDataURL(GetSQLQueryDataURLParam param,
                            UcloudHandler<GetSQLQueryDataURLResult> handler,
                            Boolean... asyncFlag);

    /**
     * 删除数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteCatalogDatabaseResult deleteCatalogDatabase(
            DeleteCatalogDatabaseParam param) throws Exception;

    /**
     * 删除数据库 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteCatalogDatabase(DeleteCatalogDatabaseParam param,
                               UcloudHandler<DeleteCatalogDatabaseResult> handler,
                               Boolean... asyncFlag);

    /**
     * 获取命名查询列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListNamedQueriesResult listNamedQueries(
            ListNamedQueriesParam param) throws Exception;

    /**
     * 获取命名查询列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listNamedQueries(ListNamedQueriesParam param,
                          UcloudHandler<ListNamedQueriesResult> handler,
                          Boolean... asyncFlag);

    /**
     * 获取USQL相关授权列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListUSQLTokensResult listUSQLTokens(
            ListUSQLTokensParam param) throws Exception;

    /**
     * 获取USQL相关授权列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listUSQLTokens(ListUSQLTokensParam param,
                        UcloudHandler<ListUSQLTokensResult> handler,
                        Boolean... asyncFlag);

    /**
     * 创建命名SQL查询
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateNamedQueryResult createNamedQuery(
            CreateNamedQueryParam param) throws Exception;

    /**
     * 创建命名SQL查询 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createNamedQuery(CreateNamedQueryParam param,
                          UcloudHandler<CreateNamedQueryResult> handler,
                          Boolean... asyncFlag);

    /**
     * 获取命名SQL查询
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetNamedQueryResult getNamedQuery(
            GetNamedQueryParam param) throws Exception;

    /**
     * 获取命名SQL查询 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getNamedQuery(GetNamedQueryParam param,
                       UcloudHandler<GetNamedQueryResult> handler,
                       Boolean... asyncFlag);

    /**
     * 删除授权
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RemoveUSQLTokenResult removeUSQLToken(
            RemoveUSQLTokenParam param) throws Exception;

    /**
     * 删除授权 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void removeUSQLToken(RemoveUSQLTokenParam param,
                         UcloudHandler<RemoveUSQLTokenResult> handler,
                         Boolean... asyncFlag);

    /**
     * 设置USQL授权的状态
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    EnableUSQLTokenResult enableUSQLToken(
            EnableUSQLTokenParam param) throws Exception;

    /**
     * 设置USQL授权的状态 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void enableUSQLToken(EnableUSQLTokenParam param,
                         UcloudHandler<EnableUSQLTokenResult> handler,
                         Boolean... asyncFlag);

    /**
     * 删除命名的SQL查询
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteNamedQueryResult deleteNamedQuery(
            DeleteNamedQueryParam param) throws Exception;

    /**
     * 删除命名的SQL查询 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteNamedQuery(DeleteNamedQueryParam param,
                          UcloudHandler<DeleteNamedQueryResult> handler,
                          Boolean... asyncFlag);

    /**
     * 删除表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteCatalogTableResult deleteCatalogTable(
            DeleteCatalogTableParam param) throws Exception;

    /**
     * 删除表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteCatalogTable(DeleteCatalogTableParam param,
                            UcloudHandler<DeleteCatalogTableResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取历史SQL查询列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListSQLQueriesResult listSQLQueries(
            ListSQLQueriesParam param) throws Exception;

    /**
     * 获取历史SQL查询列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listSQLQueries(ListSQLQueriesParam param,
                        UcloudHandler<ListSQLQueriesResult> handler,
                        Boolean... asyncFlag);

    /**
     * 获取数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetCatalogDatabaseResult getCatalogDatabase(
            GetCatalogDatabaseParam param) throws Exception;

    /**
     * 获取数据库 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getCatalogDatabase(GetCatalogDatabaseParam param,
                            UcloudHandler<GetCatalogDatabaseResult> handler,
                            Boolean... asyncFlag);

    /**
     * 增加授权
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    AddUSQLTokenResult addUSQLToken(
            AddUSQLTokenParam param) throws Exception;

    /**
     * 增加授权 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void addUSQLToken(AddUSQLTokenParam param,
                      UcloudHandler<AddUSQLTokenResult> handler,
                      Boolean... asyncFlag);

    /**
     * 创建数据库
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateCatalogDatabaseResult createCatalogDatabase(
            CreateCatalogDatabaseParam param) throws Exception;

    /**
     * 创建数据库 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createCatalogDatabase(CreateCatalogDatabaseParam param,
                               UcloudHandler<CreateCatalogDatabaseResult> handler,
                               Boolean... asyncFlag);

    /**
     * 获取数据库列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListCatalogDatabasesResult listCatalogDatabases(
            ListCatalogDatabasesParam param) throws Exception;

    /**
     * 获取数据库列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listCatalogDatabases(ListCatalogDatabasesParam param,
                              UcloudHandler<ListCatalogDatabasesResult> handler,
                              Boolean... asyncFlag);

    /**
     * 运行SQL查询
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    RunSQLQueryResult runSQLQuery(
            RunSQLQueryParam param) throws Exception;

    /**
     * 运行SQL查询 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void runSQLQuery(RunSQLQueryParam param,
                     UcloudHandler<RunSQLQueryResult> handler,
                     Boolean... asyncFlag);

    /**
     * 创建表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateCatalogTableResult createCatalogTable(
            CreateCatalogTableParam param) throws Exception;

    /**
     * 创建表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createCatalogTable(CreateCatalogTableParam param,
                            UcloudHandler<CreateCatalogTableResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取SQL查询详细信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetSQLQueryResult getSQLQuery(
            GetSQLQueryParam param) throws Exception;

    /**
     * 获取SQL查询详细信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getSQLQuery(GetSQLQueryParam param,
                     UcloudHandler<GetSQLQueryResult> handler,
                     Boolean... asyncFlag);

    /**
     * 获取SQL查询结果
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetSQLQueryDataResult getSQLQueryData(
            GetSQLQueryDataParam param) throws Exception;

    /**
     * 获取SQL查询结果 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getSQLQueryData(GetSQLQueryDataParam param,
                         UcloudHandler<GetSQLQueryDataResult> handler,
                         Boolean... asyncFlag);

    /**
     * 获取数据库中所有表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListCatalogTablesResult listCatalogTables(
            ListCatalogTablesParam param) throws Exception;

    /**
     * 获取数据库中所有表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listCatalogTables(ListCatalogTablesParam param,
                           UcloudHandler<ListCatalogTablesResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取数据表的DDL
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetCatalogTableDDLResult getCatalogTableDDL(
            GetCatalogTableDDLParam param) throws Exception;

    /**
     * 获取数据表的DDL (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getCatalogTableDDL(GetCatalogTableDDLParam param,
                            UcloudHandler<GetCatalogTableDDLResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取数据表的参数列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ListCatalogTablePropertiesResult listCatalogTableProperties(
            ListCatalogTablePropertiesParam param) throws Exception;

    /**
     * 获取数据表的参数列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void listCatalogTableProperties(ListCatalogTablePropertiesParam param,
                                    UcloudHandler<ListCatalogTablePropertiesResult> handler,
                                    Boolean... asyncFlag);
}