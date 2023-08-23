package com.Jocata.IDfy.SERVICES;


import com.Jocata.IDfy.DATAMODEL.IdfyRequest;
import com.Jocata.IDfy.DATAMODEL.IdfyResponse;

public interface ServiceLayer {
    public IdfyResponse IdfyProfile(IdfyRequest idfyRequest);
}

