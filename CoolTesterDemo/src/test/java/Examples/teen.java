package Examples;

public class teen {
	int p1,p2,p3;
	
	public void tenn(int param1, int param2, int param3) {
	    this.p1= param1;
	    this.p2= param2;
	    this.p3= param3;
	    
	    isteen(p1, p2, p3);
	              
	}
	
	public static void isteen(int param1, int param2, int param3) {
		if ((param1>=13 && param1<=19)|| (param2>=13 && param2<=19) || (param3>=13 && param3<=19)) {
			//return t	rue;
			System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	public static void isteen(int param1) {
		if (param1>=13 && param1<=19) {
			//return t	rue;
			System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
}
