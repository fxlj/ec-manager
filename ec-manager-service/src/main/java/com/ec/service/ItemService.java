package com.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.mapper.ItemMapper;

@Service
public class ItemService {

	@Autowired
	private ItemMapper itemMapper;

}
