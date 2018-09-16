package edu.udg.caes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void testSayHello(){
        Hello hello = new Hello();
        final String result = hello.Say();
        assertEquals(result, "Hello World!");
    }
}
