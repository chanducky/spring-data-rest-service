package com.sm.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sm.entity.FoodItmCategoryMap;



@Repository
public class FoodItmCategoryMapDao implements FoodItmCategoryMapIDao{
	
	private final SessionFactory sf;

    @Autowired
    public FoodItmCategoryMapDao(SessionFactory sf) {
        this.sf=sf;
    }

	public FoodItmCategoryMap returnIfExist(Integer catId, Integer itemId) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(FoodItmCategoryMap.class);
		criteria.add(Restrictions.eq("catId", catId)).add(Restrictions.eq("itemId", itemId));

		Object obj  = criteria.uniqueResult();
		session.close();
		
		if(obj != null ){
			return (FoodItmCategoryMap) obj;
		}
		return null;

	}
}
