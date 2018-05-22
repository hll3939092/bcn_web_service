package uk.bacano.dao;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import uk.bacano.model.Login_user;

import java.util.List;


@Component("LoginRepo")
public interface LoginRepo extends MongoRepository<Login_user,ObjectId> {

    @Query(value = "{id: ?0}")
    Login_user findById(String id);

    @Query(value = "{name: ?0}")
    List<Login_user> findByName(String name);
}
