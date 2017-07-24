package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */

//Dao stands for Data Access Object
    //Every persistent class needs a DAO!

@Repository
@Transactional
//<object, then id> has to be that order
//CRUD is an acronym for create, read, update, delete
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
}
