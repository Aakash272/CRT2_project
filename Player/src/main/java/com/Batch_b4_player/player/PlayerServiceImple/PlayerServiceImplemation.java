package com.Batch_b4_player.player.PlayerServiceImple;

import com.Batch_b4_player.player.Model.PlayerModel;
import com.Batch_b4_player.player.Repositroy.PlayerRepository;
import com.Batch_b4_player.player.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImplemation implements PlayerService {
     @Autowired
    private  PlayerRepository playerRepository;
    @Override
    public PlayerModel save(PlayerModel p) {
        return playerRepository.save(p);
    }

    @Override
    public PlayerModel find(int jerseyNo) {
        return playerRepository.findById(jerseyNo).orElse(null);
    }

    @Override
    public List<PlayerModel> list() {
        return playerRepository.findAll();
    }

    @Override
    public List<PlayerModel> ListByTeam(String team_id) {
        return playerRepository.findByTeamId(team_id);
    }
}
