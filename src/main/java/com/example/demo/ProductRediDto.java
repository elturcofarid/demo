package com.example.demo;

import lombok.Data;

@Data
public class ProductRediDto {
	
	private Long id;
	private Long idCatalog;
	private Long idProduct;
	private String allyReference;
	private String productReference;
	private String sku;
	private String name;
	private String descripption;
	private String brand;
	private Long stock;
	private String store;
	private Double priceByStore;
	private String productCategory1;
	private String productCategory2;
	private String productCategory3;
	private String productCategory4;
	private Double priceWithDiscount;
	private Double discount;
	private String startDateDiscount;
	private String endDateDiscount;
	private String imgProduct;
	private String categoryCombiantion;
	private String nameCombiantion;
	private Integer publicationStatus;
	private String brandCode;
	private Integer collectionYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdCatalog() {
		return idCatalog;
	}
	public void setIdCatalog(Long idCatalog) {
		this.idCatalog = idCatalog;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getAllyReference() {
		return allyReference;
	}
	public void setAllyReference(String allyReference) {
		this.allyReference = allyReference;
	}
	public String getProductReference() {
		return productReference;
	}
	public void setProductReference(String productReference) {
		this.productReference = productReference;
	}
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
	public String getDescripption() {
		return descripption;
	}
	public void setDescripption(String descripption) {
		this.descripption = descripption;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public Double getPriceByStore() {
		return priceByStore;
	}
	public void setPriceByStore(Double priceByStore) {
		this.priceByStore = priceByStore;
	}
	public String getProductCategory1() {
		return productCategory1;
	}
	public void setProductCategory1(String productCategory1) {
		this.productCategory1 = productCategory1;
	}
	public String getProductCategory2() {
		return productCategory2;
	}
	public void setProductCategory2(String productCategory2) {
		this.productCategory2 = productCategory2;
	}
	public String getProductCategory3() {
		return productCategory3;
	}
	public void setProductCategory3(String productCategory3) {
		this.productCategory3 = productCategory3;
	}
	public String getProductCategory4() {
		return productCategory4;
	}
	public void setProductCategory4(String productCategory4) {
		this.productCategory4 = productCategory4;
	}
	public Double getPriceWithDiscount() {
		return priceWithDiscount;
	}
	public void setPriceWithDiscount(Double priceWithDiscount) {
		this.priceWithDiscount = priceWithDiscount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getStartDateDiscount() {
		return startDateDiscount;
	}
	public void setStartDateDiscount(String startDateDiscount) {
		this.startDateDiscount = startDateDiscount;
	}
	public String getEndDateDiscount() {
		return endDateDiscount;
	}
	public void setEndDateDiscount(String endDateDiscount) {
		this.endDateDiscount = endDateDiscount;
	}
	public String getImgProduct() {
		return imgProduct;
	}
	public void setImgProduct(String imgProduct) {
		this.imgProduct = imgProduct;
	}
	public String getCategoryCombiantion() {
		return categoryCombiantion;
	}
	public void setCategoryCombiantion(String categoryCombiantion) {
		this.categoryCombiantion = categoryCombiantion;
	}
	public String getNameCombiantion() {
		return nameCombiantion;
	}
	public void setNameCombiantion(String nameCombiantion) {
		this.nameCombiantion = nameCombiantion;
	}
	public Integer getPublicationStatus() {
		return publicationStatus;
	}
	public void setPublicationStatus(Integer publicationStatus) {
		this.publicationStatus = publicationStatus;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public Integer getCollectionYear() {
		return collectionYear;
	}
	public void setCollectionYear(Integer collectionYear) {
		this.collectionYear = collectionYear;
	}

	
	
	
}
