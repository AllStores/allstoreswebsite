package com.home.allstores.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stores_metadata")
public class StoreMetadata {

	@Id
	@Column(name="merchant_id" , length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	int merchant_id ;

	@Column(name="merchant_name" , length=200 , nullable=false )
	String merchant_name;

	@Column(name="items_category" , length=200 , nullable=false )
	String items_category;

	@Column(name="main_items" ,length=100 , nullable=false )
	String main_items;

	@Column(name="keywords" ,length=1000  )
	String keywords;

	@Column(name="store_address" ,length=1000  , nullable=false  )
	String store_address;

	@Column(name="website_url" ,length=200  , nullable=false  )
	String website_url;
	
	
	public int getMerchant_id() {
		return merchant_id;
	}


	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}


	public String getMerchant_name() {
		return merchant_name;
	}


	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}


	public String getItems_category() {
		return items_category;
	}


	public void setItems_category(String items_category) {
		this.items_category = items_category;
	}


	public String getMain_items() {
		return main_items;
	}


	public void setMain_items(String main_items) {
		this.main_items = main_items;
	}


	public String getKeywords() {
		return keywords;
	}


	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getStore_address() {
		return store_address;
	}


	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getWebsite_url() {
		return website_url;
	}

	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}


	@Override
	public String toString() {
		return "StoreMetadata [merchant_id=" + merchant_id + ", merchant_name="	+ merchant_name + ", items_category=" + items_category
				+ ", main_items=" + main_items + ", keywords=" + keywords+ ", store_address=" + store_address + ", website_url="
				+ website_url + "]";
	}



}
