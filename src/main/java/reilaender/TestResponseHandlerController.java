package reilaender;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Manuel Reilaender
 */

@RestController
public class TestResponseHandlerController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public TestResponseHandler test(@RequestParam(value="name", defaultValue = "World") String name) {
        return new TestResponseHandler(counter.incrementAndGet(), String.format(template, name));
    }
}
