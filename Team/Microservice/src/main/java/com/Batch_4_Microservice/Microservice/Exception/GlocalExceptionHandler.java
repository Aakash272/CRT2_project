package com.Batch_4_Microservice.Microservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlocalExceptionHandler {

    public ResponseEntity<String>  handlerInvalidTeam(InvalidTeamExceptio e){
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
