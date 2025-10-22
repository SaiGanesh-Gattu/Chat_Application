package com.chatApplication.ganesh.Repositories;

import com.chatApplication.ganesh.Entity.AuthEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthRepository extends MongoRepository<AuthEntity ,String> {
}
