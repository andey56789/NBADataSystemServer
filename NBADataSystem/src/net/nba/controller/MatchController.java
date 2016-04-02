package net.nba.controller;

import javax.annotation.Resource;

import net.nba.service.MatchService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatchController {
	@Resource
	private MatchService matchService;
	
	

}
