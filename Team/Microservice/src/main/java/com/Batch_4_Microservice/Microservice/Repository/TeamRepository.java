package com.Batch_4_Microservice.Microservice.Repository;

import com.Batch_4_Microservice.Microservice.Model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository  extends JpaRepository<TeamModel, String> {

}
