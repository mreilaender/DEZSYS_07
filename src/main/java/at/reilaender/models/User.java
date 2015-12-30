package at.reilaender.models;

import at.reilaender.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author manue
 * @version 29.12.2015
 */
@Transactional
@Component
public interface User extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUserId(Integer id);
}
