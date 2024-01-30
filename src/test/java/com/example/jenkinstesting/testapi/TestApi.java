package com.example.jenkinstesting.testapi;

import com.example.jenkinstesting.Service.TestServiceImpl.TestImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestApi {
    private final TestImpl undertest=new TestImpl();

    @org.junit.jupiter.api.Test
    void testGetNotNull() {
        assertNotNull(undertest.get());
    }

    @org.junit.jupiter.api.Test
    void testGetReturn() {
        String expected = "hello";
        String actual = undertest.get();
        assertEquals(expected, actual);
    }

    @Test
    void testGetReturnType() {
        assertNotNull(undertest.get());
        assertTrue(undertest.get() instanceof String);
    }

  }
