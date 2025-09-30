package edu.miu.cs.cs489.customermgmtapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private  Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
        main = null;
    }

    @Test
    void addNumbers() {
        int a = 10;
        int b = 20;
        assertEquals(30,main.addNumbers(a,b));
    }
}