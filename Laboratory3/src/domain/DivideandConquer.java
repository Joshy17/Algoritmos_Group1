/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Estudiantes
 */
public class DivideandConquer {
    
    public int binarySearch (int sortedArray[], int value){
        int low = 0;
        int high = sortedArray.length-1;
        int mid = (low+high)/2;
        
        while(low<=high && sortedArray[mid] != value){
            
            if(value<sortedArray[mid])
                high = mid -1;
            else
                low = mid+1;
            mid = (low+high)/2;
        }
        if(low>high)
            return -1;
        return mid;
    }
    
    public int binarySearch (int sortedArray[], int value, int low, int high){
        
        int mid = (low+high)/2;
        if(low>high)
            return -1;
        else
            if(value ==sortedArray[mid])
                return mid;
        else
                if(value<sortedArray[mid])
                    return binarySearch(sortedArray, value, low, mid-1);
        else
                   return binarySearch(sortedArray, value, low+1, high);  
        
    }
    
}
