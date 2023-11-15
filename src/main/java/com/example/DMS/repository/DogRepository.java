package com.example.DMS.repository;


import org.springframework.data.repository.CrudRepository;
import com.example.DMS.Models.Dog;


/**
 * @author Karthik Parvathaneni
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {

}
