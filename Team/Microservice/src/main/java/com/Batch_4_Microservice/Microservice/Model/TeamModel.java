package com.Batch_4_Microservice.Microservice.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class TeamModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String team_id;
    @Column(name = "name")
    private String name;
    @Column(name = "owner")
    private String owner;
}
