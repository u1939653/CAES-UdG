package edu.udg.caes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void testSayHello(){
        Assertions.assertEquals(
                new Hello().Say(),
                "Hello World!");
    }
}
