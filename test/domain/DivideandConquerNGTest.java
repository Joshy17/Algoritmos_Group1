/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author XPC
 */
public class DivideandConquerNGTest {    
    public DivideandConquerNGTest() {
    }

    @Test
    public void test() {
        int a[] = new int[50];
        util.Utility.fill(a);
        System.out.println(util.Utility.show(a));
        
        System.out.println("\nSORTING THE ARRAY");
        util.Utility.bubbleSort(a);
        System.out.println(util.Utility.show(a));

        System.out.println("\nBINARY SEARCH TEST...");
        for (int i = 0; i < 20; i++) {
            int value = util.Utility.random(99);
            
            //java.util.Arrays class
                int index = java.util.Arrays.binarySearch(a, value);
                if(index>=0)
                    System.out.println(
                    "\n\nJAVA.UTIL.ARRAYS CLASS... The element "+value+" exists "
                    + "at position ["+index+"]");
                else System.out.println(
                    "\nJAVA.UTIL.ARRAYS CLASS... The element "+value+" does not in array");

                //java.util.Collections class
                index = Collections.binarySearch(getDataList(a), value);
                if(index>=0)
                    System.out.println(
                    "\nJAVA.UTIL.COLLECTIONS CLASS... The element "+value+" exists at position ["+index+"]");
                else System.out.println(
                    "\nJAVA.UTIL.COLLECTIONS CLASS... The element "+value+" does not in array");

                DivideandConquer dc = new DivideandConquer();
                
                //iteractive binary search
                index = dc.binarySearch(a, value);
                if(index!= -1)
                    System.out.println(
                    "\nITERACTIVE BB... The element "+value+" exists at position "
                    + "["+index+"]");
                else System.out.println(
                    "\nITERACTIVE BB... The element "+value+" does not exist in array");
                
                //Recursive binary search
                index = dc.binarySearch(a, value, 0, a.length-1);
                if(index!= -1)
                    System.out.println(
                    "\nRECURSIVE BB... The element "+value+" exists at position ["
                    +index+"]");
                 else System.out.println(
                    "\nRECURSIVE BB... The element " +value+" does not exist in array");
        }//for
    }
    
        public List<Integer> getDataList(int a[]) {
         List<Integer> list =Arrays.stream(a).boxed().collect(Collectors.toList());
         return list;
    }
    
}
