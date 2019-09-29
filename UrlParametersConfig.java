package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "url-parameters")
public class UrlParametersConfig {
	private List<UrlParameterSchema> UrlParameterFilters;

	public List<UrlParameterSchema> getUrlParameterFilters() {
		return UrlParameterFilters;
	}

	public void setUrlParameterFilters(List<UrlParameterSchema> urlParameterFilters) {
		UrlParameterFilters = urlParameterFilters;
	}

	public static class UrlParameterSchema {
		private String name;
		private List<UrlParameter> urlParameter;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<UrlParameter> getUrlParameter() {
			return urlParameter;
		}

		public void setUrlParameter(List<UrlParameter> urlParameter) {
			this.urlParameter = urlParameter;
		}

		public static class UrlParameter {
			private String name;
			private String type;
			private String required;
			private String targetName;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getRequired() {
				return required;
			}

			public void setRequired(String required) {
				this.required = required;
			}

			public String getTargetName() {
				return targetName;
			}

			public void setTargetName(String targetName) {
				this.targetName = targetName;
			}
		}
	}
}