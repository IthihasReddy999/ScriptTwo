package com.slokam.script.DTO;

import com.slokam.script.entity.Scene;

import lombok.Data;
@Data
public class ActionDTO {
	
	private Integer id;
	private String description;
	private Scene scene;

}
