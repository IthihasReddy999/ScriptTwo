package com.slokam.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="SceneElement_id")
public class Dialogue extends SceneElement{


	@Id
	@GeneratedValue
    private Integer id;
	private String content;
	@ManyToOne
	@JoinColumn(name="scchId")
	private ScriptCharector scriptCharector;
	private String parantical;
	
	
	
	
	
	
}
