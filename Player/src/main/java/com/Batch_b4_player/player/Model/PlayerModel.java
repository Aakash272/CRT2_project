package com.Batch_b4_player.player.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player")
public class PlayerModel {

    @Id
    private int jerseyNo;
    @Column(name = "name")
    private String name;
   @Column(name = "role")
    private String role;
@Column(name = "team_id")
    private String team_id;
}
