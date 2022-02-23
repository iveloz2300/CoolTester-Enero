
package com.java;
import AreaCalculator.areaCalculator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaCalculator cal = new areaCalculator();
		
		double resultado = cal.area(5);
		System.out.println("El resultado del circulo es "+ resultado);
		
		double resultado3 = cal.area(5.0,4.0);
		System.out.println("El resultado del Rectangulo es "+ resultado3);
				
	}

}
