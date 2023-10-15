package designpatterns.creationalpatterns.factoryPatternWebsite;


import designpatterns.creationalpatterns.factoryPatternWebsite.website.Blog;
import designpatterns.creationalpatterns.factoryPatternWebsite.website.Shop;
import designpatterns.creationalpatterns.factoryPatternWebsite.website.Website;
import designpatterns.creationalpatterns.factoryPatternWebsite.website.WebsiteType;

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
