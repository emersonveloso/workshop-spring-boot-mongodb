package com.emersonveloso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emersonveloso.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
