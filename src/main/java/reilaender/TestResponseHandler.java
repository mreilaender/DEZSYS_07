package reilaender;

/**
 * Created by manue on 11.12.2015.
 */
public class TestResponseHandler {
    private final long id;
    private final String content;

    public TestResponseHandler(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
