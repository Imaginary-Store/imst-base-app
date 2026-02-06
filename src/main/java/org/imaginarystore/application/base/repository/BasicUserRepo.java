package org.imaginarystore.application.base.repository;

import org.imaginarystore.libraries.models.BasicUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasicUserRepo extends MongoRepository<BasicUser, String> {
}
