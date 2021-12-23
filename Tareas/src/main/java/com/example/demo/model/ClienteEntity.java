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
@Table(name = "CLIENTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteEntity {

	@Column(name = "ID")
	@Id
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "TIEMPO")
	private Long  tiempo;
	@Column(name = "UNIDAD_TIEMPO")
	private String unidadTiempo;
	@Column(name = "TAREA_PADRE_ID")
	private Long padreId;
	@Column(name = "ESTADO")
	private String estado;

}
