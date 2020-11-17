package com.example.demo;

import java.io.Serializable;



import lombok.Data;

/**
 * @author oshernandez
 *
 */
@Data
//@Entity
//@Table(name = "MARCA")
public class Brand implements Serializable  {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String brandCode;
	
	
	private String name;


	public String getBrandCode() {
		return brandCode;
	}


	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
