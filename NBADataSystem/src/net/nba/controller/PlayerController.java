package net.nba.controller;

import java.util.List;

import javax.annotation.Resource;

import net.nba.model.Player;
import net.nba.service.PlayerService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayerController {
	@Resource
	private PlayerService playerService;
	
	
}
