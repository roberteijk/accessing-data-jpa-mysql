/**
 * Created by Robert van den Eijk on 15-4-2020.
 */

package net.vandeneijk.learn.accessingdatajpamysql;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
