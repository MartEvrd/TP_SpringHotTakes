package com.epita.hottakes.tpapihottakes.infrastructure;

import com.epita.hottakes.tpapihottakes.entite.Sauce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISauceRepo extends CrudRepository<Sauce, Long> {

}
