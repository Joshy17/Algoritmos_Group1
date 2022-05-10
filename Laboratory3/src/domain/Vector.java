/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Duran Family
 */
public class Vector {

    private int n;
    private int data[]; // internal Array 
    private int count;

    public Vector(int n) {
        this.n = n;
        this.count = 0;
        this.data = new int[n];

    }

    public void fill() {
        for (int i = 0; i < data.length; i++) {
            data[i] = util.Utility.random(99);
        }
        count = data.length;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean contains(int value) {
        util.Utility.bubbleSort(data);
        DivideandConquer dc = new DivideandConquer();
        int index = dc.binarySearch(data, value);
        return index != -1;

    }

    public void add(int value) {
        if (count < this.data.length) {
            this.data[count++] = value;
        }
    }

    public void add(int value, int index) {
        if (index < count) {
            this.data[index] = value;
        }
    }

    public void remove(int value) {
        util.Utility.bubbleSort(data);
        DivideandConquer dc = new DivideandConquer();
        int pos = dc.binarySearch(data, value);
        for (int i = pos; pos >-1 && i < count - 1; i++) {
            data[i]  = data [i+1];
            
            
        }
        data[--count - 1] = 0;//Ultima posicion registrada 
        
    }
    public void removeAt (int index ){
        if (index < count){
            data [index] = 0;
        }
        
    }

    @Override
    public String toString() {
        String result = "Content \n";
        int x = 0;
        for (int i=0; i<this.data.length;i++){
            if (x++>=50){
                result += "\n";
                x = 0;
            }
            result += data[i] + " ";
        }
        return result;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    

}
