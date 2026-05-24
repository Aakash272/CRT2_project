package com.Batch_4_Microservice.Microservice.ServiceImple;

import com.Batch_4_Microservice.Microservice.Exception.InvalidTeamExceptio;
import com.Batch_4_Microservice.Microservice.Model.TeamModel;
import com.Batch_4_Microservice.Microservice.Repository.TeamRepository;
import com.Batch_4_Microservice.Microservice.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImple implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public TeamModel createTeam(TeamModel team) {
        return  teamRepository.save(team);
    }

    @Override
    public TeamModel findById(String id) throws InvalidTeamExceptio {
        return teamRepository.findById(id).orElseThrow(()-> new InvalidTeamExceptio("Team not found with id: " + id));
    }

    @Override
    public List<TeamModel> list() {
        return teamRepository.findAll();
    }
}
