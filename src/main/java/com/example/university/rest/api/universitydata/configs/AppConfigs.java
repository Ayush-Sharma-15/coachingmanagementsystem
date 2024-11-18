package com.example.university.rest.api.universitydata.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigs {
    @Bean
    ModelMapper getModelMapper()
    {
        return new ModelMapper();
    }

}
