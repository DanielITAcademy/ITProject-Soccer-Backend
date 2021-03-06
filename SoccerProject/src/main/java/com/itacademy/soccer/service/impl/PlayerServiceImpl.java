package com.itacademy.soccer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.soccer.dao.IPlayerDAO;
import com.itacademy.soccer.dto.Player;
import com.itacademy.soccer.service.IPlayerService;

@Service
public class PlayerServiceImpl implements IPlayerService{
	@Autowired
	IPlayerDAO iPlayerDAO;
	
	@Override
	public List<Player> playerList(){
		return iPlayerDAO.findAll();
	}
	
	@Override
	public List<Player> playerListByTeam(Long teamId){
		return iPlayerDAO.findByteamId(teamId);
	}

	@Override
	public Player playerByName(String playerName) {
		return iPlayerDAO.findByName(playerName);
	}
	
	@Override
	public Player playerById(Long playerId) {
		return iPlayerDAO.findById(playerId).get();
	}

	@Override
	public Player updatePlayer(Player player) {
		return iPlayerDAO.save(player);
	}

}
