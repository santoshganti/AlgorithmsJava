package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website;

import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.AboutPage;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.CommentPage;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.ContactPage;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
