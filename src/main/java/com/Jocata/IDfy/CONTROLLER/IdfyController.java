package com.Jocata.IDfy.CONTROLLER;



import com.Jocata.IDfy.DATAMODEL.Employee;
import com.Jocata.IDfy.DATAMODEL.IdfyRequest;
import com.Jocata.IDfy.DATAMODEL.IdfyResponse;
import com.Jocata.IDfy.SERVICES.EmplService;
import com.Jocata.IDfy.SERVICES.ServiceLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/idfy")
public class IdfyController{

    public static final Logger logger = LoggerFactory.getLogger(IdfyController.class);

    @Autowired
    ServiceLayer servicelayer;

    @Autowired
    EmplService emplService;

    @PostMapping("/profile")
    public IdfyResponse IdfyProfile(@RequestBody IdfyRequest idfyRequest) {
        IdfyResponse response = null;
        logger.info("IdfyController , IdfyController started ");
        try {
            response = servicelayer.IdfyProfile(idfyRequest);

        } catch (Exception e) {
            //return response;
        }
        logger.info("IdfyController , IdfyController Ended ");
        return response;
    }

        @PostMapping("/empl")
        public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
            return new ResponseEntity<Employee>(emplService.saveEmployee(employee), HttpStatus.CREATED);

    }

}



