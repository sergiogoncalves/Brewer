package com.project.dataobject;

import org.hibernate.validator.constraints.NotBlank;

public class BeerDO {
	
	@NotBlank
	private String sku;
	private String name;
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
