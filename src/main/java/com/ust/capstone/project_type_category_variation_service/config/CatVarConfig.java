package com.ust.capstone.project_type_category_variation_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class CatVarConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
