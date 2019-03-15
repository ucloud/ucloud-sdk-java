package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 创建表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateCatalogTableParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 数据库的名称
     */
    @UcloudParam("DatabaseName")
    @NotEmpty(message = "databaseName can not be empty")
    private String databaseName;
    /**
     * 数据表的名称
     */
    @UcloudParam("TableName")
    @NotEmpty(message = "tableName can not be empty")
    private String tableName;
    /**
     * 数据存储位置，如：ufile://usql/tpc/tpch-s1/nxxxx
     */
    @UcloudParam("Location")
    @NotEmpty(message = "location can not be empty")
    private String location;
    /**
     * 数据格式：比如CSV，ORC， TSV等
     */
    @UcloudParam("Formation")
    @NotEmpty(message = "formation can not be empty")
    private String formation;

    private List<Property> properties;

    private List<Column> columns;

    public CreateCatalogTableParam(String region
            , String databaseName
            , String tableName
            , String location
            , String formation
            , List<Column> columns
    ) {
        super("CreateCatalogTable");
        this.region = region;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.location = location;
        this.columns = columns;
        this.formation = formation;
    }

    @UcloudParam("Columns")
    public List<Param> checkColumns() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (columns == null || columns.isEmpty()) {
            throw new ValidationException("columns can not be empty");
        } else {
            int size = columns.size();
            for (int i = 0; i < size; i++) {
                if (columns.get(i) == null) {
                    throw new ValidationException(String.format("columns[%d] can not be null", i));
                }
                if (columns.get(i).name == null || columns.get(i).name.length() <= 0) {
                    throw new ValidationException(String.format("columns[%d].name can not be empty", i));
                }
                if (columns.get(i).type == null || columns.get(i).type.length() <= 0) {
                    throw new ValidationException(String.format("columns[%d].type can not be empty", i));
                }
                params.add(new Param(String.format("Column.%d.Name", i), columns.get(i).name));
                params.add(new Param(String.format("Column.%d.Type", i), columns.get(i).type));
            }
        }
        return params;
    }

    @UcloudParam("Properties")
    public List<Param> checkProperties() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (properties != null) {
            int size = properties.size();
            for (int i = 0; i < size; i++) {
                if (properties.get(i) == null) {
                    throw new ValidationException(String.format("properties[%d] can not be null", i));
                }
                if (properties.get(i).key == null || properties.get(i).key.length() <= 0) {
                    throw new ValidationException(String.format("properties[%d].key can not be empty", i));
                }
                params.add(new Param(String.format("Property.%d.Key", i), properties.get(i).key));
                params.add(new Param(String.format("Property.%d.Value", i), properties.get(i).value));
            }
        }
        return params;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
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

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFormation() {
        return this.formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public static class Column {

        /**
         * 字段的名称
         */
        private String name;

        /**
         * 字段的类型
         */
        private String type;

        public Column(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Property {

        /**
         * 表属性的key
         */
        private String key;

        /**
         * 表属性的value
         */
        private String value;

        public Property(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


}