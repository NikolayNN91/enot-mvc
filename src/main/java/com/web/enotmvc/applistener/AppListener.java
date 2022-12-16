package com.web.enotmvc.applistener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppListener implements ApplicationRunner {

    private final ApplicationContext context;

    public AppListener(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
