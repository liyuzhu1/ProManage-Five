package entity;

import java.io.Serializable;

public class ManageTest implements Serializable{
	// 实体类的属性和表的字段名称一一对应
		private int id;
		private String name;
		private String domain;
		private String url;
		private String method;
		private String headers;
		private String cookies;
		private String requestBodyType;
		private String body;
		private String response;
	 
		public ManageTest(int id, String name, String domain, String url ,String method,String headers,String cookies,String requestBodyType,String body,String response) {
			this.id = id;
			this.name = name;
			this.domain = domain;
			this.url = url;
			this.method = method;
			this.headers = headers;
			this.cookies = cookies;
			this.requestBodyType = requestBodyType;
			this.body = body;
			this.response = response;
		}
	 
		public ManageTest() {
		
		}
	 
		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public String getDomain() {
			return domain;
		}
	 
		public void setDomain(String domain) {
			this.domain = domain;
		}
		
		public String getUrl() {
			return url;
		}
	 
		public void setUrl(String url) {
			this.url = url;
		}
		
		public String getMethod() {
			return method;
		}
	 
		public void setMethod(String method) {
			this.method = method;
		}
		
		public String getHeaders() {
			return headers;
		}
	 
		public void setHeaders(String headers) {
			this.headers = headers;
		}
		
		public String getCookies() {
			return cookies;
		}
	 
		public void setCookies(String cookies) {
			this.cookies = cookies;
		}
		
		public String getRequestBodyType() {
			return requestBodyType;
		}
	 
		public void setRequestBodyType(String requestBodyType) {
			this.requestBodyType = requestBodyType;
		}
		
		public String getBody() {
			return body;
		}
	 
		public void setBody(String body) {
			this.body = body;
		}
		

		public String getResponse() {
			return response;
		}
	 
		public void setResponse(String response) {
			this.response = response;
		}
	 
		@Override
		public String toString() {
			return "Demo1 [id=" + id + ", name=" + name + ", domain=" + domain + "，url="+ url +", method=" + method + ", headers=" + headers + ""
					+ ", cookies=" + cookies + ", requestBodyType=" + requestBodyType + ", body=" + body + ", response=" + response + "]";
		}
}
