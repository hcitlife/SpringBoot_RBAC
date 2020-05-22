package com.hc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //@Configuration标明该类是一个配置类，它会将该类作为一个SpringBean添加到IOC容器中
public class InterceptorConfig implements WebMvcConfigurer {


    /**
     * 设置图片映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResourceHandler是指你想在url请求的路径
        //addResourceLocations是图片存放的真实路径
        registry.addResourceHandler("/temp/**").addResourceLocations("classpath:/temp/");
    }

}