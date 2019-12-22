package eu.Hemanth.restcountries.servlet;

import eu.Hemanth.restcountries.v1.rest.CountryRest;
import eu.Hemanth.restcountries.v2.rest.StripeRest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class RestApplication extends Application {
    private Set<Object> singletons = new HashSet<>();

    public RestApplication() {
        singletons.add(new CountryRest());
        singletons.add(new eu.Hemanth.restcountries.v2.rest.CountryRest());
        singletons.add(new StripeRest());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
