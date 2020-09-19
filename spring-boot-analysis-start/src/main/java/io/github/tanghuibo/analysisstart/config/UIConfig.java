package io.github.tanghuibo.analysisstart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author tanghuibo
 * @date 2020/9/19下午11:37
 */
@Configuration
public class UIConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/beanStartAnalysis/**").addResourceLocations("classpath:/beanStartAnalysisUI/");
    }
}