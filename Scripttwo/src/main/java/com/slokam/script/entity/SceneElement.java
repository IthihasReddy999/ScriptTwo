package com.slokam.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED  )
@Entity
public class SceneElement {

	@Id
	@GeneratedValue
	private Long id;
	private String sequenceId;
	@ManyToOne()
	@JoinColumn(name="sceneId")
	private Scene scene;

}
