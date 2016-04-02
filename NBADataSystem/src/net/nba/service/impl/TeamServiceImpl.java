package net.nba.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.nba.dao.BaseDao;
import net.nba.model.Conference;
import net.nba.model.Player;
import net.nba.model.Team;
import net.nba.service.TeamService;

@Service("teamService")
public class TeamServiceImpl implements TeamService {
	
	@Resource
	private BaseDao<Team> baseDao;

	@Override
	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return baseDao.find("from Team");
	}

	

}
