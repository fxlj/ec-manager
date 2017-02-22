package com.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ec.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

}
