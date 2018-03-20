package array;

import java.util.Random;

public class Array {
	
	int tabla[] = new int [11];
	Random rnd = new Random();
	int i, x = 0;
	
	public void rellenararray() {

		for (i = 1; i <= 10; i++) {
			x = (int) (rnd.nextDouble()*20);
			tabla[i] = x + 1; 
			}
			
	}
	
	public void imprimearray() {
		System.out.println(tabla[i]);
	}
	
	public static void main(String[] args) {
		Array array1;
		array1 = new Array();
		array1.rellenararray();
		array1.imprimearray();
		}
	
}

