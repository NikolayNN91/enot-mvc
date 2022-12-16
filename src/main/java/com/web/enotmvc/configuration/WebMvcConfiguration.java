package com.web.enotmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
//@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

//    public final static String HOME_URL = "/home";
//    public final static String HOME_VIEW_NAME = "homePage";
//
//    public final static String VIEW_RESOLVER_PREFIX = "webapp/WEB-INF/views/";
//    public final static String VIEW_RESOLVER_SUFFIX = ".jsp";
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("web");
//    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController(HOME_URL).setViewName(HOME_VIEW_NAME);
//    }

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver bean = new InternalResourceViewResolver();
//
////        bean.setViewClass(JstlView.class);
//        bean.setPrefix("/WEB-INF/views/");
//        bean.setSuffix(".jsp");
//
//        return bean;
//    }

//
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix(VIEW_RESOLVER_PREFIX);
//        resolver.setSuffix(VIEW_RESOLVER_SUFFIX);
////        resolver.setViewClass(JstlView.class);
//
//        registry.viewResolver(resolver);
//    }
}
