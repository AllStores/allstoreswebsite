package com.home.allstores.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.allstores.persistence.dao.StoreMetadataDAO;
import com.home.allstores.persistence.model.StoreMetadata;

@Service
public class StoreMetadataServiceImpl implements StoreMetadataService {

	@Autowired
	private StoreMetadataDAO storeMetadataDAO;

	@Transactional
	public boolean addStoreMetadata(StoreMetadata storeMetadata) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean updateStoreMetadata(StoreMetadata storeMetadata) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<StoreMetadata> getStoresMetadata() {
		return storeMetadataDAO.getStoresMetadata();
	}

	@Transactional
	public StoreMetadata getStoreMetadata(int merchantid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean removeStoreMetadata(int merchantid) {
		// TODO Auto-generated method stub
		return false;
	}

}
