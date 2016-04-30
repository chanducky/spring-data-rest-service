package com.sm.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeLinkDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeLinkSave;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.sm.entity.FoodItem;

@Service
@RepositoryEventHandler(FoodItem.class)
@Secured("ROLE_ADMIN")
public class FoodItemEventHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(FoodItem.class);
	   
	  @HandleBeforeSave
	  public void handleBeforeSave(FoodItem foodItem) {
	    LOG.debug("Before save " + foodItem.toString());
	  }
	   
	  @HandleBeforeCreate
	  public void handleBeforeCreate(FoodItem foodItem) {
	    LOG.debug("Before create "+ foodItem);
	  }
	   
	  @HandleBeforeLinkSave
	  public void handleBeforeLinkSave(FoodItem foodItem) {
	    LOG.debug("Before link save " + foodItem);
	  }
	   
	  @HandleBeforeDelete
	  public void handleBeforeDelete(FoodItem foodItem) {
	    LOG.debug("Before delete " + foodItem);
	  }
	   
	  @HandleBeforeLinkDelete
	  public void handleBeforeLinkDelete(FoodItem foodItem) {
	    LOG.debug("Before link delete " + foodItem);
	  }

}
