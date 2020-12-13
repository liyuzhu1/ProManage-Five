package com.hj.entity;

import java.io.Serializable;

public class Cases implements Serializable{
	// 实体类的属性和表的字段名称一一对应
		private int id;
		private String name;
		private String module;
		private String purpose;
	 
		public Cases(int id, String name, String module ,String purpose) {
			this.id = id;
			this.name = name;
			this.module = module;
			this.purpose = purpose;

		}
	 
		public Cases() {
		
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
	 
		public String getModule() {
			return module;
		}
	 
		public void setModule(String module) {
			this.module = module;
		}
		
		public String getPurpose() {
			return purpose;
		}
	 
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
	 
		@Override
		public String toString() {
			return "Demo1 [id=" + id + ", name=" + name + ", module=" + module + "，purpose="+ purpose +"]";
		}
}
