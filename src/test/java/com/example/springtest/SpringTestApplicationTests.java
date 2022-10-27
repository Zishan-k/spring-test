package com.example.springtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void runHelloTest() {
        Assertions.assertEquals("Hello kkk", "Hello kkk");
    }

}
