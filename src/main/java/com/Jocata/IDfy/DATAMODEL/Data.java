package com.Jocata.IDfy.DATAMODEL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {


    @JsonProperty("name")
    private  Name name;

    public Data(Name name) {
        this.name = name;
    }

    public Data() {

    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name=" + name +
                '}';
    }
}

