package at.reilaender.models;

import at.reilaender.entities.PageTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author manue
 * @version 29.12.2015
 */
@Transactional
@Component
public interface PageTestDao extends CrudRepository<PageTest, Integer> {
    PageTest findByPageId(Integer id);
}
