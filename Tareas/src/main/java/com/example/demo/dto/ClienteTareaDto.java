package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteTareaDto implements Serializable{

	private static final long serialVersionUID = 2636034157199916552L;
	private Long id;
	private Long clienteId;
	private Long tareaId;
	private BigDecimal tiempo;
	private String estado;

}
