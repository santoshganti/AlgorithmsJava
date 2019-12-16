package designpatterns.creationaldesignpatterns.factoryPatternWebsite;

import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.Website;
import designpatterns.creationaldesignpatterns.factoryPatternWebsite.website.WebsiteType;

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
