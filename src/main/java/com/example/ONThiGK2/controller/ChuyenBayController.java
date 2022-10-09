package com.example.ONThiGK2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ONThiGK2.entity.ChuyenBay;
import com.example.ONThiGK2.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired 
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay")
	private List<ChuyenBay> listChuyenBay(){
		return chuyenBayService.listChuyenBay();
	}
}
