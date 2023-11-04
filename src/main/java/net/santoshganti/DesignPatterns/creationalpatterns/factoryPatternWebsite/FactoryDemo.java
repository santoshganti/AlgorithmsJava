package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite;

import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.Website;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternWebsite.website.WebsiteType;

/**
 * Returns various instanees
 * Has multiple constructors
 * Interface Driven
 * has a lot of subclasses
 * Parameter Driven
 */

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
