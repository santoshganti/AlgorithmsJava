package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website;

import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.CartPage;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.ItemPage;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
