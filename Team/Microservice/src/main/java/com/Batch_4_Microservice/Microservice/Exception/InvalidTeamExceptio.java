package com.Batch_4_Microservice.Microservice.Exception;

public class InvalidTeamExceptio extends RuntimeException{

    public InvalidTeamExceptio(){

    }
    public InvalidTeamExceptio(String msg){
        super(msg);
    }
}
