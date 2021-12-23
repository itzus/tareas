package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "TAREA")
@Data
@Builder
public class TareaEntity {

	@Column(name = "ID")
	@Id
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;

}
