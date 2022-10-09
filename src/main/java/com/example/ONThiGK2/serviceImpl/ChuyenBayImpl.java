package com.example.ONThiGK2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ONThiGK2.entity.ChuyenBay;
import com.example.ONThiGK2.repository.ChuyenBayRepository;
import com.example.ONThiGK2.service.ChuyenBayService;

@Service
public class ChuyenBayImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> listChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

}
