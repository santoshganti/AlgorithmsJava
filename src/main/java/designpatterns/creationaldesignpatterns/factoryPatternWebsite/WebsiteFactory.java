package designpatterns.creationaldesignpatterns.factoryPatternWebsite;


import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.Blog;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.Shop;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.Website;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.WebsiteType;

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
