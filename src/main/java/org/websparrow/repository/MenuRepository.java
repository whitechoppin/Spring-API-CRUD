package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.Menu;

public interface MenuRepository extends CrudRepository<Menu, Integer> {
}
