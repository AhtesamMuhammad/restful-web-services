package com.ahtesam.rest.webservice.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahtesam.rest.webservice.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
