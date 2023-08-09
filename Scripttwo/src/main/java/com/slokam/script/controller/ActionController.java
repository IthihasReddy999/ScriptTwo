package com.slokam.script.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.script.DTO.ActionDTO;
import com.slokam.script.Service.impl.ActionServiceImpl;
import com.slokam.script.entity.Action;

@RestController
public class ActionController {

	@Autowired
	private ActionServiceImpl  actionServiceImpl;
	
	@PostMapping("/saveAction")
	public ResponseEntity<ActionDTO> saveAction(@RequestBody ActionDTO actiondto){
	System.out.println(actiondto);	
	ActionDTO  actdto=	actionServiceImpl.save(actiondto);
		return ResponseEntity.status(HttpStatus.CREATED).body(actdto);
		
	}
}
