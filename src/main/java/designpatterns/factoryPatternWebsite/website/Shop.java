package designpatterns.factoryPatternWebsite.website;

import designpatterns.factoryPatternWebsite.pages.CartPage;
import designpatterns.factoryPatternWebsite.pages.ItemPage;
import designpatterns.factoryPatternWebsite.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
