package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite;

import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.Blog;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.Shop;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.Website;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.WebsiteType;

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
