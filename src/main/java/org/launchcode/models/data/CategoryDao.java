package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by margareticloud on 7/19/17.
 */

@Repository
@Transactional //not required, pushes all transactions to the database at once?
               //however, if one thing brakes, nothing will be sent through
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
