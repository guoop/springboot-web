package com.soft.ware.service.impl;

import com.soft.ware.mapper.ProgrammerMapper;
import com.soft.ware.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammerServiceImpl implements ProgrammerService{
	@Autowired
	ProgrammerMapper programmerMapper;

}
