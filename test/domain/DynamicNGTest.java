/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author XPC
 */
public class DynamicNGTest {
    
    public DynamicNGTest() {
    }

    @Test
    public void test() {
        Dynamic dy = new Dynamic();
        System.out.println("DYNAMIC ALGORITHMS...");
        System.out.println("FACTORIAL ALGORITHM SOLUTION");
        for (int i = 0; i <= 20; i++) {
            System.out.println("Factorial of "+i+": "+dy.factorial(i));
        }
        System.out.println("\n\nFIBONACCI ALGORITHM SOLUTION");
        for (int i = 0; i <= 50; i++) {
            System.out.println("Fibonacci of " + i + dy.fibonacci(i));
        }
    }
    
}

