package io.github.tanghuibo.testweb;

import io.github.tanghuibo.analysisstart.annotation.BeanStartAnalysis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tanghuibo
 * @date 2020/9/16下午11:43
 */
@SpringBootApplication
@BeanStartAnalysis
public class TestWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestWebApplication.class, args);
    }
}
