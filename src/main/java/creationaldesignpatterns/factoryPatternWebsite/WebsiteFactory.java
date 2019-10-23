package creationaldesignpatterns.factoryPatternWebsite;


import creationaldesignpatterns.factoryPatternWebsite.website.Blog;
import creationaldesignpatterns.factoryPatternWebsite.website.Shop;
import creationaldesignpatterns.factoryPatternWebsite.website.Website;
import creationaldesignpatterns.factoryPatternWebsite.website.WebsiteType;

public abstract class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }

            case SHOP: {
                return new Shop();
            }

            default: {
                return null;
            }
        }
    }
}
