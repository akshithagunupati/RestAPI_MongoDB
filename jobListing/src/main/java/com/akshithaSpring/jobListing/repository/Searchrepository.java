package com.akshithaSpring.jobListing.repository;

import java.util.List;

import com.akshithSpring.jobListing.Model.Post;

public interface Searchrepository {
   List<Post> findByText(String text);
}
