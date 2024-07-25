package com.dldnwls.personalproject.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**") //CORS를 적용할 URL패턴
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET","POST","UPDATE")
                .maxAge(3000);
    }


}
