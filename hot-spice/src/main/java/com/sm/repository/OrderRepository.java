package com.sm.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sm.entity.Orders;

@RepositoryRestResource(collectionResourceRel="order", path="order")
public interface OrderRepository extends CrudRepository<Orders, Serializable>{

}
