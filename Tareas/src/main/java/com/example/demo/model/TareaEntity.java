package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TAREA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TareaEntity {

	@Column(name = "ID")
	@Id
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;

}
