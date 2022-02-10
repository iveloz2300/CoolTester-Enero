package com.java;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class examplesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio1. Barking dog 
		
		int hourOfDay = 22 ;
		boolean cubarking= true ; 
		boolean resultWapeUp;
		
		//resultWapeUp= shouldWakeUp(cubarking,hourOfDay);
		//System.out.println("Salida "+resultWapeUp);
	
		// Ejercicio 2. Decimal 
		double varA=4.111;
		double varB= 6.535;
		boolean resultdecimal;
		
		//resultdecimal=areEqualByThreeDecimalPlaces(varA, varB);
		
		//Ejercicio 3

		boolean resultGatos;
		
		boolean verano=false;
		int temperatura=35;
		
		resultGatos= isCatPlaying(verano, temperatura);
		
	}
	
	
//  Barking dog 
	public static boolean shouldWakeUp (boolean cubarking, int hourOfDay) {
		
		if(cubarking && hourOfDay >0 && hourOfDay>8) {
		if (cubarking==true &&  hourOfDay<=8  || hourOfDay >= 22 ) {
			return true;
		}else if (hourOfDay<=0 || hourOfDay >=23){
			return false;
		} else {
			return true;
		}
	}else {
		return false;
	}
		
  }

	
// Decimal 
	public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
		
		char [] decimal1 = new char[5];
		char [] decimal2 = new char[5];
		
		String numA= Double.toString(var1);
		String numB = Double.toString(var2);
		
		//System.out.println(numA);
		//System.out.println(numB);
				
		
		 for (int i=0;i<=4;i++ ) {
			decimal1[i]= numA.charAt(i);		
			System.out.println(decimal1[i]);	
		}
		
		for (int i=0;i<=4;i++) {
			decimal2[i]= numB.charAt(i);	
			System.out.println(decimal2[i]);	
		}
		
		
		if (decimal1[2]==decimal2[2]&&decimal1[3]==decimal2[3]&& decimal1[4]==decimal2[4]){
			System.out.println("Los 3 decimales son iguales");	
			return true;
		}else {
			System.out.println("Los 3 decimales no son iguales");		
			return false;
		} 					
	}
	
	// Gato 
	public static boolean isCatPlaying(boolean verano, int temperatura) {
		 
		if (verano) {
			if(temperatura 	>=25 && temperatura <=45) {
				System.out.println("Los gatos juegan...");		
				return true;
		}else 
		if(temperatura 	>=25 && temperatura <=35) {
			System.out.println("Los gatos juegan...");		
			return true;
			}
		}else {			
		if(temperatura 	>=25 && temperatura <=45) {
			System.out.println("Los gatos juegan...");		
			return true;
		 }else {
			 System.out.println("Los gatos NO juegan...");		
		 }
		 }
		
		return false;
		}
	
}
