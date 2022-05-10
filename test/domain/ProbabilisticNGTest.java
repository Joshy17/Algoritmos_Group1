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
public class ProbabilisticNGTest {
    
    public ProbabilisticNGTest() {
    }

    

    @Test
    public void test1() {
        Probabilistic p = new Probabilistic();
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of persons: ");
        //int n = (sc.nextInt());
        int n = 30;
        System.out.println("Paradox Birthday probability for \n"
            +n+" persons: "+p.birthdayParadox(n));
        
    }
    
    @Test
    public void test2(){
        Probabilistic p = new Probabilistic();
        int list[] = {23, 57, 10, 85, 5};
        System.out.println("Paradox Birthday probability for \n");
        for (int item : list) {
            System.out.println(
            "-->"+item+" persons: "+(p.birthdayParadox(item)));
        }
    }
    
}
