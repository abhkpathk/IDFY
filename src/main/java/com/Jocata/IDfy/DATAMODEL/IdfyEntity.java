package com.Jocata.IDfy.DATAMODEL;

import javax.persistence.*;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="idfy_profile")
public class IdfyEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;

    @Column(name=" reference_id")

    private String referenceId;
    @Column(name="request_Timedatetime")
    private Long requestTimeDatetime;
    @Column(name="response_datetime")
    private Long responseTimeDatetime;

    @Column(name="response")
    private String response;

    @Column(name="call_status")
    private String callstatus;
    @Column(name="error_message")
    private String erormessage;



    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Long getRequestTimeDatetime() {
        return requestTimeDatetime;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferanceId() {
        return referenceId;
    }

    public void setReferanceId(String referanceId) {
        this.referenceId = referanceId;
    }

    public Long getRequestTimeDatetime(long l) {
        return requestTimeDatetime;
    }

    public void setRequestTimeDatetime(Long requestTimeDatetime) {
        this.requestTimeDatetime = requestTimeDatetime;
    }

    public Long getResponseTimeDatetime() {
        return responseTimeDatetime;
    }

    public void setResponseTimeDatetime(Long responseTimeDatetime) {
        this.responseTimeDatetime = responseTimeDatetime;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getCallstatus() {
        return callstatus;
    }

    public void setCallstatus(String callstatus) {
        this.callstatus = callstatus;
    }

    public String getErormessage() {
        return erormessage;
    }

    public void setErormessage(String erormessage) {
        this.erormessage = erormessage;
    }
}



