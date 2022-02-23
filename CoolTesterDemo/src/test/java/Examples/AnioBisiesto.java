package Examples;

public class AnioBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anio = 2017;
		boolean result;
		result= isLeapYear(anio);
		if (result) {
			System.out.println("Es un año biciesto");
		}else {
			System.out.println("NO es un año biciesto");
		}
	}

	//
	public static boolean isLeapYear(int year) {
		if (year >1 && year <=9999) {
			//return true;
	
			if (year % 4==0 ) {
				if (year %100 ==0) {
					if (year % 400 ==0) {
						return true;
					}
				}
			}
		}
		return false ; 
	}
}
