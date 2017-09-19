package com.project.dataobject;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class BeerDO {
	
	@NotBlank(message = "SKU is required")
	private String sku;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@Size(min = 1, max = 50, message = "Size of description must to be between 1 and 50")
	private String descricao;
	
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
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
