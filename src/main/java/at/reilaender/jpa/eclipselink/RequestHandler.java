package at.reilaender.jpa.eclipselink;

import at.reilaender.entities.UserTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Manuel Reilaender
 */

//@RestController
//@RequestMapping(value = "/users")
public class RequestHandler {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@PersistenceContext(unitName = "dezsys7_test")
    //private EntityManager entityManager;

    /*
    //@RequestBody UserEntity userEntity
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UserTest> createUser(@RequestParam(value = "asd", defaultValue = "") String name) {
        //entityManager = Persistence.createEntityManagerFactory("dezsys7_test").createEntityManager();
        UserTest user = entityManager.find(UserTest.class, 1);
        entityManager.getTransaction().begin();
        entityManager.persist(new UserTest("ASDASD", "ASDASdjnwco2eno2oc"));
        entityManager.getTransaction().commit();
        return new ResponseEntity<UserTest>(user, HttpStatus.CREATED);
    }
    */
    @RequestMapping("/exit")
    public void exit() {
        System.exit(1);
    }
}
