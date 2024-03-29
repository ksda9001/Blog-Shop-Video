package com.video.config;

import com.video.util.XMLUtil;
import com.video.util.XMLUtil2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebPathConfig implements WebMvcConfigurer {
    //将静态文件映射到“/”
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/video/**")
                .addResourceLocations("file:" + XMLUtil.getText());
        registry.addResourceHandler("/picture/**")
                .addResourceLocations("file:" + XMLUtil2.getText());
    }
}
