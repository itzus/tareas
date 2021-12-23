package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;

@Component
public class Mapper {

	private JMapper registrar(Class origen, Class destino) {
		JMapperAPI api = new JMapperAPI().add(JMapperAPI.mappedClass(origen));
		return new JMapper(origen, destino, api);
	}

	public <T> T convert(Object origen, T destino) {
		return (T) registrar(origen.getClass(), destino.getClass()).getDestination(origen);
	}

}
