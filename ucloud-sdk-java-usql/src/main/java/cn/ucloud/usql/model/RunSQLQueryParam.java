package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 运行SQL查询 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RunSQLQueryParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 数据库名称
     */
    @UcloudParam("DatabaseName")
    @NotEmpty(message = "databaseName can not be empty")
    private String databaseName;
    /**
     * SQL查询语句
     */
    @NotEmpty(message = "queryString can not be empty")
    private String queryString;


    public RunSQLQueryParam(String region
            , String databaseName
            , String queryString
    ) {
        super("RunSQLQuery");
        this.region = region;
        this.databaseName = databaseName;
        this.queryString = queryString;
    }

    @UcloudParam("QueryString")
    public List<Param> checkQueryString() throws ValidationException, UnsupportedEncodingException {
        List<Param> params = new ArrayList<>();
        if (queryString == null || queryString.length() <= 0){
            throw new ValidationException("queryString can not be empty");
        }
        params.add(new Param("QueryString",new String(Base64.encodeBase64((queryString).getBytes("utf-8")))));
        return params;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }


}