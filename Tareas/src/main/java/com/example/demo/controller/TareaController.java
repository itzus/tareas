package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ITareaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("tareas/")
public class TareaController {

	@Autowired
	private ITareaService tareaService;

	@Operation(summary = "consultar tareas")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Exito al retornar lista de tareas"),
			@ApiResponse(responseCode = "404", description = "error al recuperar la lista") })
	@GetMapping
	public List tareas() {
		return tareaService.getTareas();
	}
}
