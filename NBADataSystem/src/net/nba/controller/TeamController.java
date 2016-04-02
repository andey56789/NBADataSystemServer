package net.nba.controller;

import java.util.List;

import javax.annotation.Resource;

import net.nba.model.Conference;
import net.nba.model.Team;
import net.nba.service.TeamService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeamController {
	@Resource
	private TeamService teamService;
	
	@RequestMapping("/getTeams")
	public @ResponseBody List<Team> getTeams(){
		return teamService.getTeams();
	}
	
}
