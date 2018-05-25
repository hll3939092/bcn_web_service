package uk.bacano.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import uk.bacano.model.Game;

import java.util.List;

public interface BetRepo extends MongoRepository<Game,ObjectId> {


    @Query(value = "{id: ?0}")
    List<Game> findAllById(String id);
}
