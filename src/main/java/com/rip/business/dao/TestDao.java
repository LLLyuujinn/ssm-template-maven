package com.rip.business.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rip.business.entity.Test;

@Repository("testDao")
public interface TestDao {

	public List<Test> test();
}
