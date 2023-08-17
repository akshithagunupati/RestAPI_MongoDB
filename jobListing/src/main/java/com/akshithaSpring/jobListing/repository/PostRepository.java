package com.akshithaSpring.jobListing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akshithSpring.jobListing.Model.Post;

public interface PostRepository extends MongoRepository<Post,String>{

}
