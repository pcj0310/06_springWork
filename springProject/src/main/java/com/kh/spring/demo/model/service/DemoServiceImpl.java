package com.kh.spring.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.demo.model.dao.DemoDao;
import com.kh.spring.demo.model.vo.Dev;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;
	
	// 트랜잭션 처리 , SqlSession생성 및 반환 모두 생략
	@Override
	public int insertDev(Dev dev) {
		return demoDao.insertDev(dev);
	}

	@Override
	public List<Dev> selectDevList() {
		return demoDao.selectDevList();
	}
	
	@Override
	public Dev selectOneDev(int no) {
		return demoDao.selectOneDev(no);
	}
	
	@Override
	public int updateDev(Dev dev) {
		return demoDao.updateDev(dev);
	}

}
