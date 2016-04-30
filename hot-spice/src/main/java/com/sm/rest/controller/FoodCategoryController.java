package com.sm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sm.entity.FoodItmCategoryMap;
import com.sm.repository.FoodItmCategoryMapIDao;
import com.sm.repository.FoodItmCategoryMapRepository;

@RestController
@RequestMapping("/api")
public class FoodCategoryController {

	@Autowired
	FoodItmCategoryMapRepository foodItmCategoryMapRepository; 
	
	@Autowired
	FoodItmCategoryMapIDao foodItmCategoryMapDao; 

	@RequestMapping(value="/fooditemcategorymap", method={RequestMethod.POST, RequestMethod.PUT })
	public FoodItmCategoryMap foodItmCategoryMap(@RequestBody FoodItmCategoryMap ficm){
		System.out.println(" recieved data = " + ficm.toString());
		FoodItmCategoryMap returnData = null;
		
		returnData =	foodItmCategoryMapDao.returnIfExist(ficm.getCatId(), ficm.getItemId());
		if(returnData == null){
			returnData = foodItmCategoryMapRepository.save(ficm);
		}
		return returnData;

	}

	@RequestMapping(value="/fooditemcategorymap", method=RequestMethod.GET)
	public Iterable<FoodItmCategoryMap> foodItmCategoryMap(){
		return foodItmCategoryMapRepository.findAll();

	}

	@RequestMapping(value = "/fooditemcategorymap/{id}", method = RequestMethod.GET)
	public FoodItmCategoryMap foodItmCategoryMapById(@PathVariable String id) {
		return (StringUtils.isEmpty(id) ? new FoodItmCategoryMap()
				: foodItmCategoryMapRepository.findOne(Integer.parseInt(id)));
	}
	
	@RequestMapping(value="/fooditemcategorymap", method=RequestMethod.DELETE)
	public void deleteFoodItmCategoryMap(@RequestBody FoodItmCategoryMap ficm){
		foodItmCategoryMapRepository.delete(ficm);
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	public String exceptionHandler(Exception ex){
		return ex.toString();
	}
}
