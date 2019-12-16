package designpatterns.creationaldesignpatterns.factoryPatternWebsite.website;

import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.CartPage;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.ItemPage;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
