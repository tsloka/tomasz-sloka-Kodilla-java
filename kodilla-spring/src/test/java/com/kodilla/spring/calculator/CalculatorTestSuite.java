package com.kodilla.spring.calculator;

import com.kodilla.spring.SpringRunnerS;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRunnerS.class)
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = calculator.add(0.7, -1.3);
        double b = calculator.sub(-1.3, -0.7);
        double c = calculator.mul(-1.2, -5);
        double d = calculator.div(-5, -0.5);
        //Then
        Assert.assertEquals(-0.6, a, 0.0001);
        Assert.assertEquals(-0.6, b, 0.0001);
        Assert.assertEquals(6, c, 0.0001);
        Assert.assertEquals(10, d, 0.0001);
    }
}
