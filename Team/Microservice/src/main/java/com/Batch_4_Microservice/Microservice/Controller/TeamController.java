package com.Batch_4_Microservice.Microservice.Controller;

import com.Batch_4_Microservice.Microservice.Model.TeamModel;
import com.Batch_4_Microservice.Microservice.ServiceImple.TeamServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamServiceImple teamServiceImple;

    @PostMapping("/create")
    public ResponseEntity<TeamModel> create(@RequestBody TeamModel team){
        TeamModel res=teamServiceImple.createTeam(team);
        return new ResponseEntity<TeamModel>(res, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamModel> findById(@PathVariable String id) {
        return ResponseEntity.ok(teamServiceImple.findById(id));
    }

    @GetMapping("/All")
    public ResponseEntity<List<TeamModel>> list() {
        return ResponseEntity.ok(teamServiceImple.list());
    }
}
