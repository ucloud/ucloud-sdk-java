/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.udbproxy.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ListUDBProxyClientResponse extends Response {

    
        
    /**
     * 代理ID
     */
    @SerializedName("UDBProxyID")
    private String udbProxyID;
        
    
        
    /**
     * 代理节点客户端IP连接信息
     */
    @SerializedName("NodeClientInfos")
    private List<NodeClientInfo> nodeClientInfos;
        
    
    public String getUDBProxyID() {
        return udbProxyID;
    }

    public void setUDBProxyID(String udbProxyID) {
        this.udbProxyID = udbProxyID;
    }
    
    public List<NodeClientInfo> getNodeClientInfos() {
        return nodeClientInfos;
    }

    public void setNodeClientInfos(List<NodeClientInfo> nodeClientInfos) {
        this.nodeClientInfos = nodeClientInfos;
    }
    
        public static class NodeClientInfo extends Response {
            
        
    /**
     * 客户端IP连接信息
     */
    @SerializedName("Records")
    private List<ProxyProcesslist> records;
        
    
        
    /**
     * 代理节点ID
     */
    @SerializedName("ID")
    private String id;
        
    
        
    /**
     * 代理节点IP
     */
    @SerializedName("IP")
    private String ip;
        
    
    public List<ProxyProcesslist> getRecords() {
        return records;
    }

    public void setRecords(List<ProxyProcesslist> records) {
        this.records = records;
    }
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public String getIP() {
        return ip;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }
    
        }
        public static class ProxyProcesslist extends Response {
            
        
    /**
     * 当前连接DB进程ID
     */
    @SerializedName("ID")
    private Integer id;
        
    
        
    /**
     * 启动这个线程的用户
     */
    @SerializedName("User")
    private String user;
        
    
        
    /**
     * 代理连接DB地址
     */
    @SerializedName("Host")
    private String host;
        
    
        
    /**
     * 当前执行的命令是在哪一个数据库上。如果没有指定数据库，则该值为 NULL
     */
    @SerializedName("DB")
    private String db;
        
    
        
    /**
     * 显示当前连接的执行的命令
     */
    @SerializedName("Command")
    private String command;
        
    
        
    /**
     * 表示该线程处于当前状态的时间
     */
    @SerializedName("Time")
    private Integer time;
        
    
        
    /**
     * 线程的状态，和 Command 对应
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 一般记录的是线程执行的语句
     */
    @SerializedName("Info")
    private String info;
        
    
        
    /**
     * 代理连接DB地址
     */
    @SerializedName("ClientHost")
    private String clientHost;
        
    
        
    /**
     * 数据库资源ID
     */
    @SerializedName("DBID")
    private String dbid;
        
    
        
    /**
     * 数据库角色(主库/从库)
     */
    @SerializedName("Role")
    private String role;
        
    
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    
    public String getDB() {
        return db;
    }

    public void setDB(String db) {
        this.db = db;
    }
    
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
    
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public String getClientHost() {
        return clientHost;
    }

    public void setClientHost(String clientHost) {
        this.clientHost = clientHost;
    }
    
    public String getDBID() {
        return dbid;
    }

    public void setDBID(String dbid) {
        this.dbid = dbid;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
        }
}









