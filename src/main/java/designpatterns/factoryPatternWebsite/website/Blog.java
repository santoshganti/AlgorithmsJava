package designpatterns.factoryPatternWebsite.website;

import designpatterns.factoryPatternWebsite.pages.AboutPage;
import designpatterns.factoryPatternWebsite.pages.CommentPage;
import designpatterns.factoryPatternWebsite.pages.ContactPage;
import designpatterns.factoryPatternWebsite.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
