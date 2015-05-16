package com.home.allstores.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.allstores.common.WebsiteConstants;
import com.home.allstores.persistence.model.StoreMetadata;
import com.home.allstores.persistence.service.StoreMetadataService;
import com.home.allstores.utils.AllStoresUtils;

@Controller
public class DBController {
	
	@Autowired
	private StoreMetadataService storeMetadataService; 
	
	@RequestMapping(value = {WebsiteConstants.FETCH_STORES_METADATA_URL}, method = RequestMethod.GET ,  headers="Accept=application/json" , produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
    public String getStoresMetadataList() {
		 List<StoreMetadata> storesMetadata = storeMetadataService.getStoresMetadata();
		 return AllStoresUtils.getJSON(storesMetadata);
	}
	
	
}
