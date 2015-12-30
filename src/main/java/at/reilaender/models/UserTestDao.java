package at.reilaender.models;

import at.reilaender.entities.UserTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author manue
 * @version 29.12.2015
 */
@Transactional
@Component
public interface UserTestDao extends CrudRepository<UserTest, Integer> {
    UserTest findByUserId(Integer id);
}
