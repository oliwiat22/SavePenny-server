package com.oliwiatrojniak.saveapenny.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

import static java.util.Collections.singletonList;

@Configuration
public class CORSConfigurationBean {

  private static final List<String> EXPOSED_HEADERS = List.of(
      "Access-Control-Allow-Headers", "Access-Control-Allow-Origin", "Authorization, x-xsrf-token, Access-Control-Allow-Headers, Origin, "
          + "Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers"
  );

  @Bean
  public FilterRegistrationBean<CorsFilter> CORSFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.setAllowedOrigins(List.of("http://localhost:8081/", "http://localhost:5173/"));
    config.setAllowedMethods(singletonList("*"));
    config.setAllowedHeaders(singletonList("*"));
    config.setExposedHeaders(EXPOSED_HEADERS);
    source.registerCorsConfiguration("/**", config);
    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);

    return bean;
  }

}