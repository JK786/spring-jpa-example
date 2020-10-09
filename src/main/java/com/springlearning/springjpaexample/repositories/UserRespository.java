package com.springlearning.springjpaexample.repositories;

import com.springlearning.springjpaexample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends CrudRepository<User,Long> {

}
