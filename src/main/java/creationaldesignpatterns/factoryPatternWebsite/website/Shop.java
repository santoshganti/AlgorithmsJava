package creationaldesignpatterns.factoryPatternWebsite.website;

import creationaldesignpatterns.factoryPatternWebsite.pages.CartPage;
import creationaldesignpatterns.factoryPatternWebsite.pages.ItemPage;
import creationaldesignpatterns.factoryPatternWebsite.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
