package com.tts.swaggeruserlab.repository;

import com.tts.swaggeruserlab.model.UserV2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryV2 extends CrudRepository<UserV2, Long> {
    UserV2 findByState(String state);
}
