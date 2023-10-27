package com.epita.hottakes.tpapihottakes.infrastructure;

import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<UserHotTakes, Long>{

    UserHotTakes findByEmail(String email);

}
