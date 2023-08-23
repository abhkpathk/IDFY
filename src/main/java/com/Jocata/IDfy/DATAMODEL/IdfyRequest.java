package com.Jocata.IDfy.DATAMODEL;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.ManyToOne;


public class IdfyRequest {
    @JsonProperty("reference_id")
    private String referenceid;
    @JsonProperty("group_id")
    private  String groupid;


    @JsonProperty("config")
    private Config config;

    @JsonProperty("data")
    private Data data;


    public IdfyRequest(String referenceid, String groupid, Config config, Data data) {
        this.referenceid = referenceid;
        this.groupid = groupid;
        this.config = config;
        this.data = data;
    }

    public IdfyRequest() {

    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }


    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IdfyRequest{" +
                "referenceid='" + referenceid + '\'' +
                ", groupid='" + groupid + '\'' +
                ", config=" + config +
                ", data=" + data +
                '}';
    }
}

