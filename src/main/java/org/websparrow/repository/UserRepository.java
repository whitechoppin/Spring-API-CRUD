package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
