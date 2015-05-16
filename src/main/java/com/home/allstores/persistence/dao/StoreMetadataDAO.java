package com.home.allstores.persistence.dao;

import java.util.List;

import com.home.allstores.persistence.model.StoreMetadata;

public interface StoreMetadataDAO {

	public boolean addStoreMetadata(StoreMetadata storeMetadata);
	
	public boolean updateStoreMetadata(StoreMetadata storeMetadata);
	
	public List<StoreMetadata> getStoresMetadata();

	public StoreMetadata getStoreMetadata(int merchantid);
	
	public boolean removeStoreMetadata(int merchantid);
	
}
