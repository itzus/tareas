package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TareaDto;
import com.example.demo.model.TareaEntity;
import com.example.demo.repository.TareaRepository;
import com.example.demo.service.ITareaService;
import com.example.demo.util.Mapper;

@Service
public class TareaServiceImpl implements ITareaService {

	@Autowired
	private TareaRepository repositorio;
	@Autowired
	private Mapper mapper;

	@Override
	public List<TareaDto> getTareas() {
		List<TareaEntity> lista = repositorio.findAll();
		return mapper.convert(lista, TareaDto.builder().build());
	}

}
