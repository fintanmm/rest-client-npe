package org.acme.rest.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CountryCallTest {

    String testData = "[\r\n  {\r\n    \"name\": \"Ireland\",\r\n    \"alpha2Code\": \"IE\",\r\n    \"capital\": \"Dublin\",\r\n    \"currencies\": [\r\n      {\r\n        \"code\": \"EUR\",\r\n        \"name\": \"Euro\",\r\n        \"symbol\": \"\u20AC\"\r\n      }\r\n    ]\r\n  },\r\n  {\r\n    \"name\": \"United Kingdom of Great Britain and Northern Ireland\",\r\n    \"alpha2Code\": \"GB\",\r\n    \"capital\": \"London\",\r\n    \"currencies\": [\r\n      {\r\n        \"code\": \"GBP\",\r\n        \"name\": \"British pound\",\r\n        \"symbol\": \"\u00A3\"\r\n      }\r\n    ]\r\n  }\r\n]";

    @Test
    public void testCallingRestService() {
        CountryCall countryCall = new CountryCall();
        assertNotNull(countryCall.byName("ireland"));

    }
}
