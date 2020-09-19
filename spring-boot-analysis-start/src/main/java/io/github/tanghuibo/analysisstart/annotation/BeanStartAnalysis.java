package io.github.tanghuibo.analysisstart.annotation;

import io.github.tanghuibo.analysisstart.config.BeanInitConfig;
import io.github.tanghuibo.analysisstart.controller.BeanStartController;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author tanghuibo
 * @date 2020/9/19下午11:08
 */
@Import({
        BeanInitConfig.class,
        BeanStartController.class
})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BeanStartAnalysis {
}
