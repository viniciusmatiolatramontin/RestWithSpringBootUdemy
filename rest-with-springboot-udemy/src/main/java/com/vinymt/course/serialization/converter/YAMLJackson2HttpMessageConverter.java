package com.vinymt.course.serialization.converter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YAMLJackson2HttpMessageConverter extends AbstractJackson2HttpMessageConverter{

	public YAMLJackson2HttpMessageConverter() {
		super(new YAMLMapper(), MediaType.parseMediaType("application/x-yaml") );
		// TODO Auto-generated constructor stub
	}

}
