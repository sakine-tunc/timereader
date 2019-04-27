package com.sakinetunc.timereader;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnglishTimeReaderTest {
    @Test
    void sayTime() {
        EnglishTimeReader timeReader = new EnglishTimeReader();

        assertEquals("It's 13 to 6.", timeReader.sayTime("5:47"), "ok");
        assertEquals("It's 1 past 5.", timeReader.sayTime("5:01"), "ok");
        assertEquals("It's half past 5.", timeReader.sayTime("5:30"), "ok");
        assertEquals("It's quarter past 5.", timeReader.sayTime("5:15"), "ok");
        assertEquals("It's 5 o'clock.", timeReader.sayTime("5:00"), "ok");
    }
}