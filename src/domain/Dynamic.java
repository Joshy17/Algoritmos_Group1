/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author XPC
 */
public class Dynamic {

    public long fibonacci(long pos) {
        long sig = 1, act = 0, temp = 0;
        for (long i = 1; i <= pos; i++) {
            System.out.print(act + ", ");
            temp = act;
            act = sig;
            sig = sig + temp;
        }
        System.out.println(act);
        return act;
    }
    
    public static long factorial(long num) {
		if (num < 0)
			num = num * -1;
		if (num <= 0)
			return 1;
		long factorial = 1;
		while (num > 1) {
			factorial = factorial * num;
			num--;
		}
		return factorial;
	}

}
