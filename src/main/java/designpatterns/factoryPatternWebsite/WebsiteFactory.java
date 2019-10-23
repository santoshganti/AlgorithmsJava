package designpatterns.factoryPatternWebsite;


import designpatterns.factoryPatternWebsite.website.Blog;
import designpatterns.factoryPatternWebsite.website.Shop;
import designpatterns.factoryPatternWebsite.website.Website;
import designpatterns.factoryPatternWebsite.website.WebsiteType;

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
