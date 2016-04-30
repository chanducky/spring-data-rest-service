package com.sm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sm.entity.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends PagingAndSortingRepository<User, Serializable> {
	List<User> findByName(@Param("name") String name);
}
