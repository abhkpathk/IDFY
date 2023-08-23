package com.Jocata.IDfy.DATAMODEL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {
    @JsonProperty("id")
    private String id;

    @JsonProperty("overrides")
    private Overrides overrides;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Overrides getOverrides() {
        return overrides;
    }

    public void setOverrides(Overrides overrides) {
        this.overrides = overrides;
    }



}

