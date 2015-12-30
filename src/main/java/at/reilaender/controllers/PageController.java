package at.reilaender.controllers;

import at.reilaender.entities.PageTest;
import at.reilaender.models.PageTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author manue
 * @version 29.12.2015
 */
@Controller
@RequestMapping(value = "/pages")
public class PageController {
    @Autowired
    private PageTestDao pageTestDao;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PageTest> createPage(@RequestParam String title, @RequestParam(required = false) String description, @RequestParam String content) {
        PageTest pageTest = new PageTest(title, description, content);
        this.pageTestDao.save(pageTest);
        return new ResponseEntity<>(pageTest, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<PageTest> find(@RequestParam Integer id) {
        PageTest pageTest = null;
        pageTest = this.pageTestDao.findByPageId(id);
        if(pageTest == null)
            return  new ResponseEntity<PageTest>(pageTest, HttpStatus.NOT_FOUND);
        return new ResponseEntity<PageTest>(pageTest, HttpStatus.FOUND);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<PageTest> updatePage(@RequestParam Integer id, @RequestParam(required = false) String title, @RequestParam(required = false) String description, @RequestParam(required = false) String content) {
        PageTest pageTest = null;
        pageTest = this.pageTestDao.findByPageId(id);
        if(title != null)
            pageTest.setPageTitle(title);
        if(description != null)
            pageTest.setPageDescription(description);
        if(content != null)
            pageTest.setPageContent(content);
        this.pageTestDao.save(pageTest);
        return new ResponseEntity<PageTest>(pageTest, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<PageTest> deletePage(@RequestParam Integer id) {
        PageTest pageTest = null;
        pageTest = this.pageTestDao.findOne(id);
        if(pageTest == null)
            return new ResponseEntity<PageTest>(pageTest, HttpStatus.NOT_FOUND);
        this.pageTestDao.delete(pageTest);
        return new ResponseEntity<PageTest>(pageTest, HttpStatus.OK);
    }
}
