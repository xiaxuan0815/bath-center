package com.lihaiyang.controller;


import com.lihaiyang.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/level")
public class LevelController {
	@Autowired
	private LevelService levelService;
}
