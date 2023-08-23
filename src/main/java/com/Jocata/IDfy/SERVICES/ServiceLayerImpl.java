package com.Jocata.IDfy.SERVICES;


import com.Jocata.IDfy.DATAMODEL.IdfyEntity;
import com.Jocata.IDfy.DATAMODEL.IdfyRequest;
import com.Jocata.IDfy.DATAMODEL.IdfyResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayerImpl   implements ServiceLayer  {
    //private ResponseEntity response;

    public static final Logger logger = LoggerFactory.getLogger(ServiceLayerImpl.class);
    private IdfyEntity idfyEntity=new IdfyEntity();

    @Autowired
    private ProfileServiceLayer profileservicelayer;
    @Override
    public IdfyResponse IdfyProfile(IdfyRequest idfyRequest) {

        logger.info("IdfyServiceImpl , IdfyProfile started ", idfyRequest.getReferenceid());
        ObjectMapper objectMapper = new ObjectMapper();

        IdfyResponse idfyResponse = new IdfyResponse();
        String response = null;
//            IdfyResponse response = null;
        long timeMillis = System.currentTimeMillis();
        try {
            String referenceId = idfyRequest.getData().getName().getFirstname() +"_"+String.valueOf(timeMillis);
            String data="{\n" +
                    "    \"reference_id\": \"" + referenceId + "\",\n" +
                    "    \"config\": {\n" +
                    "        \"id\": \"954be5b0-c0b9-4839-89c0-465578d7680f\"\n" +
                    "    },\n" +
                    "    \"data\": {\n" +
                    "    }\n" +
                    "}";
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
            headers.set("Accept-Encoding", "gzip");
            headers.set("Accept-Encoding", "deflate");
            headers.set("account-id", "dc19e8ab14e0/d24a765f-43fe-4956-a7be-4f11773b39c3");
            headers.set("api-key", "2a68e7c0-49aa-4653-8334-27d0cb33c8fb");
            HttpEntity<String> request = new HttpEntity<String>(data, headers);
            long requestTime = System.currentTimeMillis();
            response = new RestTemplate().postForObject("https://api.kyc.idfy.com/sync/profiles", request, String.class);
            if (response != null) {

                idfyEntity.setCallstatus("Success");
                idfyEntity.setRequestTimeDatetime(requestTime);
                idfyEntity.setResponseTimeDatetime(System.currentTimeMillis());
                idfyEntity.setErormessage("No Error");
//                idfyEntity.setCapturelink(response.getCapturelink());
//                idfyEntity.setProfileid(response.getProfileid());
                idfyEntity.setReferanceId(referenceId);
                idfyEntity.setResponse(response);
                IdfyEntity idfyEntity = profileservicelayer.saveResponse(this.idfyEntity);
            }else{
                idfyEntity.setCallstatus("Failure");
                idfyEntity.getRequestTimeDatetime(requestTime);
                idfyEntity.setResponseTimeDatetime(System.currentTimeMillis());
                idfyEntity.setErormessage("Something Went Wrong!");
                IdfyEntity idfyEntity = profileservicelayer.saveResponse(this.idfyEntity);
            }
            idfyResponse = objectMapper.readValue(response, IdfyResponse.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return idfyResponse;
    }
}

