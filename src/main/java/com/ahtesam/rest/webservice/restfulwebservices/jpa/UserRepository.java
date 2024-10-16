package com.ahtesam.rest.webservice.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahtesam.rest.webservice.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
