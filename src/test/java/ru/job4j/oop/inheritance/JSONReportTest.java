package ru.job4j.inheritance;

import org.junit.Test;
import ru.job4j.oop.inheritance.JSONReport;

import static org.junit.Assert.*;

public class JSONReportTest {

    @Test
    public void whenTestGenerateMethod() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"Report's name\"," + ln
                + "\t\"body\" : \"Report's body\"" + ln
                + "}";
        String name = "Report's name";
        String body = "Report's body";
        JSONReport reportJ = new JSONReport();
        String result = reportJ.generate(name, body);
        assertEquals(expected, result);
    }
}