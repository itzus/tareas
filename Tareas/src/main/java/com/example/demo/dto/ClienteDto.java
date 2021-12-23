package com.example.demo.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 3384275470532194318L;
	private Long id;
	private String nombre;
	private String descripcion;
	private Long  tiempo;
	private String unidadTiempo;
	private Long padreId;
	private String estado;

}
