package org.example.demo.test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RepeatedTestAndTestInstanceTest {

    private int counter = 0;

    @Test
    @RepeatedTest(3)
    public void testMethod1(){
        counter ++;
        System.out.println(counter);
    }

    @Test
    public void testMethod2(){
        counter ++;
        System.out.println(counter);
    }


}
