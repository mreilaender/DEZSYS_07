package at.reilaender.controllers;

import at.reilaender.entities.PageTest;
import at.reilaender.entities.UserTest;
import at.reilaender.models.PageTestDao;
import at.reilaender.models.UserTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author manue
 * @version 29.12.2015
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private PageTestDao pageTestDao;

    @Autowired
    private UserTestDao userTestDao;

    @RequestMapping("/user/get-by-id")
    @ResponseBody
    public String getById(Integer id) {
        UserTest test = this.userTestDao.findOne(1);
        return test.getUserName();
    }

    @RequestMapping(value = "/page/get-by-id", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public  ResponseEntity<PageTest> getByPageId(@RequestParam Integer id) {
        PageTest page = this.pageTestDao.findByPageId(id);
        return new ResponseEntity<>(page, HttpStatus.FOUND);
    }
}
