package creationaldesignpatterns.factoryPatternWebsite.website;

import creationaldesignpatterns.factoryPatternWebsite.pages.AboutPage;
import creationaldesignpatterns.factoryPatternWebsite.pages.CommentPage;
import creationaldesignpatterns.factoryPatternWebsite.pages.ContactPage;
import creationaldesignpatterns.factoryPatternWebsite.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
