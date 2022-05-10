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
public class VectorNGTest {
    
    public VectorNGTest() {
    }

    @Test
    public void test() {
        Vector vector = new Vector(50);
        vector.add(30);
        vector.fill(); //lleno el vector
        System.out.println(vector.toString());
        System.out.println("The vector has "+vector.size()+" elements");
        if(!vector.isEmpty())
            System.out.println("The vector is not empty");
        else System.out.println("The vector is empty");
        System.out.println("Adding elements to vector");
        System.out.println("Adding element [22] at position [10]. IT'S NOT POSSIBLE!!!");
        vector.add(22, 10);
        System.out.println("Adding element [44] at position [5]. IT'S NOT POSSIBLE!!!");
        vector.add(44, 5);
        System.out.println("Adding element [55] at position [0]. IT'S NOT POSSIBLE!!!");
        vector.add(55, 0);
        System.out.println(vector.toString());
        
        //Encuentro elementos dentro del vector
        System.out.println("SEARCHING ELEMENTS...");
        DivideandConquer dc = new DivideandConquer();
        for (int i = 0; i < 30; i++) {
            int value = util.Utility.random(50);
            System.out.println(vector.contains(value)
                    ?"The element "+value+" exists at position: "
                    +dc.binarySearch(vector.getData(), value,0,vector.getCount()-1)
                    :"The element "+value+" does not exist in vector"
            );
        }
        
        System.out.println("Deleting element at position [10]");
        vector.removeAt(10);
        System.out.println(vector.toString());
        System.out.println("Adding element [22] at position [10]. "
                + "NOW IT'S POSSIBLE!!!");
        vector.add(22, 10);
        
        System.out.println("Deleting element at position [5]");
        vector.removeAt(5);
        System.out.println(vector.toString());
        System.out.println("Adding element [44] at position [5]. "
                + "NOW IT'S POSSIBLE!!!");
        vector.add(44, 5);
        
        System.out.println("Deleting element at position [0]");
        vector.removeAt(0);
        System.out.println(vector.toString());
        System.out.println("Adding element [55] at position [0]. "
                + "NOW IT'S POSSIBLE!!!");
        vector.add(55, 0);
        System.out.println(vector.toString());
        
        //trying to remove some elements
        System.out.println("\nDELETING SOME ITEMS...");
        util.Utility.bubbleSort(vector.getData()); //sorting for search
        for (int i = 0; i < 30; i++) {
            int value = util.Utility.random(99);
            if(vector.contains(value)){
                vector.remove(value);
                System.out.println("The item ["+value+"] was removed from the vector");
            }
        }
    }
    
}