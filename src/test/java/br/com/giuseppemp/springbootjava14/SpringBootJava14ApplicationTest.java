package br.com.giuseppemp.springbootjava14;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = SpringBootJava14Application.class)
public class SpringBootJava14ApplicationTest {

    @Test
    public void helloWorld() {
        // Arrange
        SpringBootJava14Application spring = new SpringBootJava14Application();
        // Act
        var actual = spring.helloWorld();
        // Assert
        assertNotNull(actual);
    }
}