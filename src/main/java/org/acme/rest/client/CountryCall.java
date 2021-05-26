package org.acme.rest.client;
import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CountryCall {
    @Inject
    @RestClient
    CountriesService countriesService;

    CountryCall() {
    }
    
    public CompletionStage<Set<Country>> byName(String name) {
        return countriesService.getByNameAsync(name);
    }
}
