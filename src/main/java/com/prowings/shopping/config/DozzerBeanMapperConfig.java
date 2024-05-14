package com.prowings.shopping.config;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozzerBeanMapperConfig {

	
	@Bean
	public DozerBeanMapper beanMapper()
	{
		DozerBeanMapper mapper=new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		return mapper;
	}
}
