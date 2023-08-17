package com.akshithaSpring.jobListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshithSpring.jobListing.Model.Post;
import com.akshithaSpring.jobListing.repository.PostRepository;
import com.akshithaSpring.jobListing.repository.Searchrepository;



@RestController
public class PostController {
	@Autowired
	PostRepository repo;
	
	@Autowired
	Searchrepository srepo;
	
	//example
  @RequestMapping(value="/")
  public void sample() {
	  System.out.println("Hey");
  }
	
  //get all posts
  @GetMapping("/posts")
  public List<Post> getAllPosts(){
	  return repo.findAll();
  }
  
  @PostMapping("/posts")
  public Post addPost(@RequestBody Post post) {
	  return repo.save(post);
  }
  
  @GetMapping("/posts/{text}")
  public List<Post> getSearchData(@PathVariable String text)
  {
	  return srepo.findByText(text);
  }
	
}
