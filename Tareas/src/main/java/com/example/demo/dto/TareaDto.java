package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TareaDto implements Serializable{

	private static final long serialVersionUID = 2808079673198535769L;
	private Long id;
	private String nombre;

}
