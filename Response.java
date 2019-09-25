package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "response")
public class AppResponseConfig {
	private List<String> selectFrom;

	public List<String> getSelectFrom() {
		return selectFrom;
	}

	public void setSelectFrom(List<String> selectFrom) {
		this.selectFrom = selectFrom;
	}
}
