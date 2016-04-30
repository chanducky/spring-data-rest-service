package com.sm.configuration;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import com.sm.entity.FoodCategory;
import com.sm.entity.FoodItem;
import com.sm.entity.OrderDetails;
import com.sm.entity.Orders;

@Component
public class CustomizedRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	  config.setBasePath("/api");
	  config.exposeIdsFor(FoodCategory.class);
	  config.exposeIdsFor(FoodItem.class);
	  config.exposeIdsFor(Orders.class);
	  config.exposeIdsFor(OrderDetails.class);
	
  }
}
