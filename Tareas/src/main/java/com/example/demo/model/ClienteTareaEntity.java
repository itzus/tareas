package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CLIENTE_X_TAREA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteTareaEntity {

	@Column(name = "ID")
	@Id
	private Long id;

	@Column(name = "CLIENTE_ID")
	private Long clienteId;

	@Column(name = "TAREA_ID")
	private Long tareaId;

	@Column(name = "TIEMPO")
	private BigDecimal tiempo;

	@Column(name = "ESTADO")
	private String estado;

}
