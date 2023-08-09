package com.slokam.script.Service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.script.DAO.ActionDAO;
import com.slokam.script.DTO.ActionDTO;
import com.slokam.script.Service.IActionService;
import com.slokam.script.entity.Action;
@Service
public class ActionServiceImpl implements IActionService {
	@Autowired
	private ActionDAO actionDAO;
	
	@Autowired
	private ModelMapper  modelMapper;

	@Override
	public ActionDTO save(ActionDTO actiondto) {
		Action act=modelMapper.map(actiondto, Action.class);
		actionDAO.save(act);
		actiondto.setId(act.getId());
		
		return actiondto;
	}

}
