package com.emersonveloso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emersonveloso.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
