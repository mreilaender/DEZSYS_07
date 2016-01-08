package at.reilaender.controllers;

import at.reilaender.entities.PageTest;
import at.reilaender.models.PageTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author mreilaender
 * @version 08.01.2015
 */
@Controller
@RequestMapping(value = "/pages")
public class PageController {
    @Autowired
    private PageTestDao pageTestDao;

    /**
     * Handles POST requests on the URL /pages
     * @param pageTest Page Entry which will be created
     * @return Created Page and HttpStatus.CREATED
     */
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<PageTest> createPage(@RequestBody PageTest pageTest) {
        this.pageTestDao.save(pageTest);
        return new ResponseEntity<>(pageTest, HttpStatus.CREATED);
    }

    /**
     * Handles GET requests on the URL /pages
     * Method is used to find Pages by the ID
     * @param id Used to specify a specific Page
     * @return Found Page and HttpStatus.FOUND
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<PageTest> findById(@RequestParam Integer id) {
        PageTest pageTest = null;
        pageTest = this.pageTestDao.findByPageId(id);
        if(pageTest == null)
            return  new ResponseEntity<PageTest>(pageTest, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(pageTest, HttpStatus.FOUND);
    }

    /**
     * Handles PUT requests on the URL /pages/{id}
     * {id} is a placeholder for the id of a Page
     * This method updates an existing Page Entry
     * @param id Used to specify a specific Page
     * @param pageTest Page Entry with the updated Columns
     * @return Updated page and HttpStatus.OK
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<PageTest> updatePage(@PathVariable Integer id, @RequestBody PageTest pageTest) {
        PageTest pageTestTmp = this.pageTestDao.findByPageId(id);
        if(pageTest.getPageTitle() != null)
            pageTestTmp.setPageTitle(pageTest.getPageTitle());
        if(pageTest.getPageDescription() != null)
            pageTestTmp.setPageDescription(pageTest.getPageDescription());
        if(pageTest.getPageContent() != null)
            pageTestTmp.setPageContent(pageTest.getPageContent());
        this.pageTestDao.save(pageTest);
        return new ResponseEntity<>(pageTestTmp, HttpStatus.OK);
    }

    /**
     * Handles DELETE requests on the URL /pages/{id}
     * {id} is a placeholder for the id of a Page
     * This method is used to delete an existing Page Entry
     * @param id Used to specify a specific Page
     * @return Deleted Page and HttpStatus.OK
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<PageTest> deletePageById(@PathVariable Integer id) {
        PageTest pageTest = null;
        pageTest = this.pageTestDao.findOne(id);
        if(pageTest == null)
            return new ResponseEntity<PageTest>(pageTest, HttpStatus.NOT_FOUND);
        this.pageTestDao.delete(pageTest);
        return new ResponseEntity<>(pageTest, HttpStatus.OK);
    }
}
