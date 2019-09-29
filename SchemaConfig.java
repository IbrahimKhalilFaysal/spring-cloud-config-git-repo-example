package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "schema")
public class SchemaConfig {

	private List<Schema> filterSchema;

	public List<Schema> getFilterSchema() {
		return filterSchema;
	}

	public void setFilterSchema(List<Schema> filterSchema) {
		this.filterSchema = filterSchema;
	}

	public static class Schema {
		private String name;
		private Request request;
		private Response response;

		public Request getRequest() {
			return request;
		}

		public void setRequest(Request request) {
			this.request = request;
		}

		public Response getResponse() {
			return response;
		}

		public void setResponse(Response response) {
			this.response = response;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static class Request {
			private List<UrlParameter> urlParameter;
			private List<BodyParameter> bodyParameter;
			private List<Header> header;

			public List<UrlParameter> getUrlParameter() {
				return urlParameter;
			}

			public void setUrlParameter(List<UrlParameter> urlParameter) {
				this.urlParameter = urlParameter;
			}

			public List<BodyParameter> getBodyParameter() {
				return bodyParameter;
			}

			public void setBodyParameter(List<BodyParameter> bodyParameter) {
				this.bodyParameter = bodyParameter;
			}

			public List<Header> getHeader() {
				return header;
			}

			public void setHeader(List<Header> header) {
				this.header = header;
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

			public static class Header {
				private String name;
				private String type;
				private String value;
				private String targetName;
				private String targetType;
				private String propType;
				private String propKeyPrefix;

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

				public String getValue() {
					return value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getTargetName() {
					return targetName;
				}

				public void setTargetName(String targetName) {
					this.targetName = targetName;
				}

				public String getTargetType() {
					return targetType;
				}

				public void setTargetType(String targetType) {
					this.targetType = targetType;
				}

				public String getPropType() {
					return propType;
				}

				public void setPropType(String propType) {
					this.propType = propType;
				}

				public String getPropKeyPrefix() {
					return propKeyPrefix;
				}

				public void setPropKeyPrefix(String propKeyPrefix) {
					this.propKeyPrefix = propKeyPrefix;
				}
			}
		}

		public static class Response {
			private List<String> selectFrom;

			public List<String> getSelectFrom() {
				return selectFrom;
			}

			public void setSelectFrom(List<String> selectFrom) {
				this.selectFrom = selectFrom;
			}
		}
	}
}