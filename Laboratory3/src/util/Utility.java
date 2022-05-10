/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Utility {
    
    public static int random(int bound){
        
        return 1+(int) Math.floor(Math.random()*bound);
    }
    
    public static void fill(int [] a){
        
        Random random = new Random();
        
        for(int i = 0; i< a.length; i++){
            
            a[i] = random.nextInt(99);
        }
        
    }
    
    public static String show(int a[]){
        
        String result = "\nArray content\n";
        
        for(int i = 0; i < a.length; i++){
            
            result += a[i]  + " ";
        }
        return result;
    }
    
    public static void bubbleSort(int a[]){
        
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                
                if(a[j] < a[i]){
                    
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
    }
}
