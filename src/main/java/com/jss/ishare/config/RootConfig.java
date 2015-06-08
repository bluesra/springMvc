package com.jss.ishare.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

/**
 * Created by apple on 6/7/15.
 */
@Configuration
//@ComponentScan(basePackages={"com.jss.ishare"},
//        excludeFilters={
//                @ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
//        })
//public class RootConfig {
//
//}
@ComponentScan(basePackages={"com.jss.ishare"},
        excludeFilters={
                @ComponentScan.Filter(type=FilterType.CUSTOM, value=RootConfig.WebPackage.class)
        })
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("com.jss.ishare\\.web"));
        }
    }
}