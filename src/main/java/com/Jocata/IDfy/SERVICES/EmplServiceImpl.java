package com.Jocata.IDfy.SERVICES;

import com.Jocata.IDfy.DATAMODEL.Employee;
import com.Jocata.IDfy.REPOSITORY.EmplRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmplServiceImpl implements EmplService{

    @Autowired
    private EmplRespository emplRespository;

    public EmplServiceImpl(EmplRespository emplRespository) {
        super();
        this.emplRespository = emplRespository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return emplRespository.save(employee);
    }
}
