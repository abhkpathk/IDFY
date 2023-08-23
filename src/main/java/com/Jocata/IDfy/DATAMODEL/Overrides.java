package com.Jocata.IDfy.DATAMODEL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Overrides {

    @JsonProperty("video_kyc_priority")
    int videokycpriority;
    @JsonProperty("assignee")
    List<String> assignee;

    public int getVideokycpriority() {
        return videokycpriority;
    }

    public void setVideokycpriority(int videokycpriority) {
        this.videokycpriority = videokycpriority;
    }

    public List<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<String> assignee) {
        this.assignee = assignee;
    }
}

