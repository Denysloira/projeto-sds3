package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visitd;
	private Long deals;

	public SaleSuccessDTO() {
		
	}

	public SaleSuccessDTO(Seller seller, Long visitd, Long deals) {
		sellerName = seller.getName();
		this.visitd = visitd;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisitd() {
		return visitd;
	}

	public void setVisitd(Long visitd) {
		this.visitd = visitd;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	
	
}
