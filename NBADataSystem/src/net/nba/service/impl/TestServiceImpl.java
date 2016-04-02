package net.nba.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.nba.dao.BaseDao;
import net.nba.model.MatchInfo;
import net.nba.model.Player;
import net.nba.model.Team;
import net.nba.model.TeamMatchInfo;
import net.nba.service.TestService;
@Service("testService")
public class TestServiceImpl implements TestService {
	@Resource
	private BaseDao<Team> baseDao;

	@Override
	public List<Object> getTestData() {
		// TODO Auto-generated method stub
//		List<Team> list=baseDao.find("from MatchInfo");
//		List<Object> list2=new ArrayList<Object>();
//		for (MatchInfo matchInfo : list) {
//			for (TeamMatchInfo teamMatchInfo : matchInfo.getTeamMatchInfos()) {
//				teamMatchInfo.setMatch(null);
//			}
//			list2.add(matchInfo);
//		}
//		return list2;
		
		
//		List<TeamMatchInfo> list1=baseDao.find("from TeamMatchInfo");
//		List<Object> list2=new ArrayList<Object>();
//		for (TeamMatchInfo t : list1) {
//			t.getMatch().setTeamMatchInfos(null);
//			list2.add(t);
//		}
//		return baseDao.find("from MatchInfo");
		return null;
	}

}
