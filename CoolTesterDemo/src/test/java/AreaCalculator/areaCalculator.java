package AreaCalculator;

public class areaCalculator {

	
	// Metodo
	public double area(double param1, double param2) {
		// Rectangulo 
		double result;
		result = param1 *  param2;
		return (result); 
		
	}

	public double area(double radio) {
		// Circulo
		double result;
		double pi= 3.1416;		
		result = radio *  radio * pi;
		return (result); 
		
	}
	
}
