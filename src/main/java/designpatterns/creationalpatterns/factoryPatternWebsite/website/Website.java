package designpatterns.creationalpatterns.factoryPatternWebsite.website;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();


}
