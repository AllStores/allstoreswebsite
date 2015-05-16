package com.home.allstores.persistence.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.allstores.persistence.model.StoreMetadata;

@Repository
public class StoreMetadataDAOImpl implements StoreMetadataDAO {

	@Autowired
	private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
	
	@Override
	public boolean addStoreMetadata(StoreMetadata storeMetadata) {
		return false;
	}

	@Override
	public boolean updateStoreMetadata(StoreMetadata storeMetadata) {
		return false;
	}

	@Override
	public List<StoreMetadata> getStoresMetadata() {
		Session session = this.sessionFactory.getCurrentSession();
        List<StoreMetadata> storesMetadataList = session.createCriteria(StoreMetadata.class).list();
        return storesMetadataList;
	}

	@Override
	public StoreMetadata getStoreMetadata(int merchantid) {
		return null;
	}

	@Override
	public boolean removeStoreMetadata(int merchantid) {
		return false;
	}

}
