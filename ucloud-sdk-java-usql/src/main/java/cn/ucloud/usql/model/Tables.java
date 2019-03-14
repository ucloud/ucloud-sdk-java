package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 数据库中所有数据表 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class Tables {
    /**
     * 数据表名称
     */
    @SerializedName("Name")
    private String name;
    /**
     * 数据表的所有列
     */
    @SerializedName("Columns")
    private List<Column> columns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Column> getColumns() {
        return this.columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }


}