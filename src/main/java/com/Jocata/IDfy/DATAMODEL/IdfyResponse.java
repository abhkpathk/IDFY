package com.Jocata.IDfy.DATAMODEL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="idfy_Response")
public class IdfyResponse {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @JsonProperty("capture_expires_at")
    @Column(name="capture_expires_at")
    private String captureexpiresat;

    @JsonProperty("capture_link")
    @Column(name="capture_link")
    private String capturelink;

    @JsonProperty("profile_id")
    @Column(name="profile_id")
    private String profileid;

    public String getCaptureexpiresat() {
        return captureexpiresat;
    }

    public void setCaptureexpiresat(String captureexpiresat) {
        this.captureexpiresat = captureexpiresat;
    }

    public String getCapturelink() {
        return capturelink;
    }

    public void setCapturelink(String capturelink) {
        this.capturelink = capturelink;
    }

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }
}


