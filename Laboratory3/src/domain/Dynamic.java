/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Duran Family
 */
public class Dynamic {

    public long fibonacci(long posicion) {
        long siguiente = 1, actual = 0, temporal = 0;
        for (long x = 1; x <= posicion; x++) {
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        System.out.println(actual);
        return actual;
    }
    
    public static long factorial(long numero) {
		if (numero < 0)
			numero = numero * -1;
		if (numero <= 0)
			return 1;
		long factorial = 1;
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}

}
