package designpatterns.creationaldesignpatterns.factoryPatternWebsite.website;

import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.AboutPage;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.CommentPage;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.ContactPage;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
