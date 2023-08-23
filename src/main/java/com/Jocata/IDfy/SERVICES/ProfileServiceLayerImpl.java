package com.Jocata.IDfy.SERVICES;


import com.Jocata.IDfy.DATA.ProfileServiceLayerDao;
import com.Jocata.IDfy.DATAMODEL.IdfyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceLayerImpl implements ProfileServiceLayer{

    @Autowired
    private ProfileServiceLayerDao profileservicelayerdao;
    @Override
    public IdfyEntity saveResponse(IdfyEntity idfyEntity){

        return profileservicelayerdao.saveResponse(idfyEntity);
    }
}

