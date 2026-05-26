package com.Batch_b4_player.player.Service;

import com.Batch_b4_player.player.Model.PlayerModel;

import java.util.List;

public interface PlayerService {
    PlayerModel save(PlayerModel p);
    PlayerModel find(int jerseyNo) ;
    List<PlayerModel> list();
    List<PlayerModel> ListByTeam(String team_id);
}
