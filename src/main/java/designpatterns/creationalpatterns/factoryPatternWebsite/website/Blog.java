package designpatterns.creationalpatterns.factoryPatternWebsite.website;

import designpatterns.creationalpatterns.factoryPatternWebsite.pages.AboutPage;
import designpatterns.creationalpatterns.factoryPatternWebsite.pages.CommentPage;
import designpatterns.creationalpatterns.factoryPatternWebsite.pages.ContactPage;
import designpatterns.creationalpatterns.factoryPatternWebsite.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
