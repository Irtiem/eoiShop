package com.es.eoi.shop.entities;

import com.es.eoi.shop.interfaces.Prizable;

public abstract class Article implements Prizable {

	private String name;
	private String description;
	private Double price=0.0;
	private String vat;
	private String provider;
	private Integer stock;
	private String category;
	
	private static final Double DEFAULT_VAT=1.21;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public Double getTotalPrice() {		
		System.out.println("CALCULADO CON IVA DEFAULT");
		return this.getPrice()*DEFAULT_VAT;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "Article [name=" + name + ", description=" + description + ", price=" + price + ", vat=" + vat
				+ ", provider=" + provider + ", stock=" + stock + ", category=" + category + "]";
	}

	


}
