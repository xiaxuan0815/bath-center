package com.lihaiyang.controller;


import com.lihaiyang.entity.Artificer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.lihaiyang.service.ArtificerService;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/artificer")
public class ArtificerController {
	@Autowired
	private ArtificerService artificerService;

	@GetMapping("list")
	public List<Artificer> list(){
		return artificerService.list();
	}

	@GetMapping("get-by-id")
	@HystrixCommand(fallbackMethod = "getFallBack")
	public Artificer getById(@RequestParam("id") Long id){
		Artificer artificer = artificerService.getById(id);
		if (Objects.isNull(artificer)){
			throw new RuntimeException();
		}
		return artificerService.getById(id);
	}

	public Artificer getFallBack(Long id){
		Artificer artificer = new Artificer();
		artificer.setName("页面丢失");
		return artificer;
	}
}
