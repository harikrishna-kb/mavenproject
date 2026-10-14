package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testMark() {
        App app = new App();
        assertEquals("S grade", app.mark(90));
    }
}
