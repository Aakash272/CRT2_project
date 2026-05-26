package com.Batch_b4_player.player.Repositroy;

import com.Batch_b4_player.player.Model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PlayerRepository  extends JpaRepository<PlayerModel, String> {
}
