package com.Batch_4_Microservice.Microservice.Service;

import com.Batch_4_Microservice.Microservice.Model.TeamModel;

import java.util.List;

public interface TeamService {

    TeamModel createTeam(TeamModel team);
    TeamModel findById(String id);
    List<TeamModel> list();
}
