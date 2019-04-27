package com.sakinetunc.timereader;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TurkishTimeReaderTest {
    @Test
    void sayTime() {
        TurkishTimeReader timeReader = new TurkishTimeReader();

        assertEquals("Saat 6 13 var.", timeReader.sayTime("5:47"), "ok");
        assertEquals("Saat 5 1 geçiyor.", timeReader.sayTime("5:01"), "ok");
        assertEquals("Saat 5 buçuk.", timeReader.sayTime("5:30"), "ok");
        assertEquals("Saat 5 çeyrek geçiyor.", timeReader.sayTime("5:15"), "ok");
        assertEquals("Saat 5.", timeReader.sayTime("5:00"), "ok");
    }
}