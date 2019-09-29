package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "body-parameters")
public class BodyParametersConfig {
	private List<BodyParameterSchema> bodyParameterFilters;

	public List<BodyParameterSchema> getBodyParameterFilters() {
		return bodyParameterFilters;
	}

	public void setBodyParameterFilters(List<BodyParameterSchema> bodyParameterFilters) {
		this.bodyParameterFilters = bodyParameterFilters;
	}

	public static class BodyParameterSchema {
		private String name;
		private List<BodyParameter> bodyParameter;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<BodyParameter> getBodyParameter() {
			return bodyParameter;
		}

		public void setBodyParameter(List<BodyParameter> bodyParameter) {
			this.bodyParameter = bodyParameter;
		}

		public static class BodyParameter {
			private String name;
			private String type;
			private String dataType;
			private String required;
			private String targetName;
			private List<String> options;

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

			public String getDataType() {
				return dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public List<String> getOptions() {
				return options;
			}

			public void setOptions(List<String> options) {
				this.options = options;
			}
		}
	}
}