package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testQuote() {
        App app = new App();
        String quote = app.getQuote();
        // We expect the quote to be exactly this string
        assertEquals("Keep coding and stay curious!", quote);
    }
}