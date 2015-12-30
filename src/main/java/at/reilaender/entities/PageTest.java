package at.reilaender.entities;

import javax.persistence.*;

/**
 * @author manue
 * @version 29.12.2015
 */
@Entity
@Table(name = "page", schema = "dezsys7_test", catalog = "")
public class PageTest {
    private int pageId;
    private String pageTitle;
    private String pageDescription;
    private String pageContent;

    public PageTest() {}

    public PageTest(String pageTitle, String pageDescription, String pageContent) {
        this.pageTitle = pageTitle;
        this.pageDescription = pageDescription;
        this.pageContent = pageContent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id")
    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "page_title")
    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @Basic
    @Column(name = "page_description")
    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    @Basic
    @Column(name = "page_content")
    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageTest pageTest = (PageTest) o;

        if (pageId != pageTest.pageId) return false;
        if (pageTitle != null ? !pageTitle.equals(pageTest.pageTitle) : pageTest.pageTitle != null) return false;
        if (pageDescription != null ? !pageDescription.equals(pageTest.pageDescription) : pageTest.pageDescription != null)
            return false;
        if (pageContent != null ? !pageContent.equals(pageTest.pageContent) : pageTest.pageContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pageId;
        result = 31 * result + (pageTitle != null ? pageTitle.hashCode() : 0);
        result = 31 * result + (pageDescription != null ? pageDescription.hashCode() : 0);
        result = 31 * result + (pageContent != null ? pageContent.hashCode() : 0);
        return result;
    }
}
