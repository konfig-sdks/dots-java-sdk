package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.dots.dev/api";
        
        // Configure HTTP basic authorization: api_key
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        Dots client = new Dots(configuration);
        assertNotNull(client);
    }
}
