/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import domain.Dynamic;

/**
 *
 * @author XPC
 */
public class Test {

    Dynamic dp = new Dynamic();

    public String testFactorial() {
        String output = "";

        output += "\n\nFIBONACCI ALGORITHM SOLUTION";
        for (int i = 0; i <= 50; i++) {
            output += "Fibonacci of " + i + dp.fibonacci(i);

        }
        return output;
    }
}
