package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApp() {
        assertEquals("Hello from Jenkins Maven Pipeline!", App.getMessage());
    }
}
