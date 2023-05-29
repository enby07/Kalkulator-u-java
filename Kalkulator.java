public class Kalkulator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String operacija;
		//int br1, br2;
		String br1, br2;
		int rezultat = 0;		
		boolean nastavi = true;
		
		while(nastavi) {
			System.out.print("-> ");
			br1 = scan.next();
			System.out.print("o: ");
			operacija = scan.next();
			char znak = operacija.charAt(0);
			System.out.print("-> ");
			br2 = scan.next();
			
			
			if(isInteger(br1) && isInteger(br2) && znak =='+' ) {
				int a = Integer.parseInt(br1);
				int b = Integer.parseInt(br2);
				
				System.out.println(a+b);
			}
			else if((!isInteger(br1) || !isInteger(br2)) && znak =='+' ) {
				double a = Double.parseDouble(br1);
				double b = Double.parseDouble(br2);
				
				System.out.println(a+b);
			}
			
			else if(isInteger(br1) && isInteger(br2) && znak =='-' ) {
				int a = Integer.parseInt(br1);
				int b = Integer.parseInt(br2);
				
				System.out.println(a-b);
			}
			else if((!isInteger(br1) || !isInteger(br2)) && znak =='-' ) {
				double a = Double.parseDouble(br1);
				double b = Double.parseDouble(br2);
				
				System.out.println(a-b);
			}
			else if(isInteger(br1) && isInteger(br2) && znak =='*' ) {
				int a = Integer.parseInt(br1);
				int b = Integer.parseInt(br2);
				
				System.out.println(a*b);
			}
			else if((!isInteger(br1) || !isInteger(br2)) && znak =='*' ) {
				double a = Double.parseDouble(br1);
				double b = Double.parseDouble(br2);
				
				System.out.println(a*b);
			}
			/*
			 * else if(isInteger(br1) && isInteger(br2) && znak =='/' ) { int a =
			 * Integer.parseInt(br1); int b = Integer.parseInt(br2);
			 * 
			 * System.out.println(a/b); }
			 */
			else if((!isInteger(br1) || isInteger(br2)) && znak =='/' ) {
				double a = Double.parseDouble(br1);
				double b = Double.parseDouble(br2);
				
				System.out.println(a/b);
			}
			
				
			
			
			
			/*
			 * if(znak == '+') { rezultat = sabiranje(br1, br2);
			 * System.out.println("Rezultat: " + rezultat); } else if(znak == '-') {
			 * rezultat = oduzimanje(br1, br2); System.out.println("Rezultat: " + rezultat);
			 * } else if(znak == '*') { rezultat = mnozenje(br1, br2);
			 * System.out.println("Rezultat: " + rezultat); } else if(znak == '/' && br2 !=
			 * 0) { rezultat = deljenje(br1, br2); System.out.println("Rezultat: " +
			 * rezultat); }
			 * 
			 * else System.out.println("Operacije nije validna! ");
			 */
			
			
			//System.out.println("Rezultat: " + rezultat);
			
			System.out.println("Da li zelite da nastavite? (y/n)");
			
			String in =  scan.next();
			char nastavak = in.charAt(0);
			
			if(nastavak == 'y')
				nastavi = true;
			else {
				System.out.println("Program je zavrsen.!");
				nastavi = false;
			}
			
		}		
		

	}
	
	public static int sabiranje(int a, int b) {
		return a + b;
	}
	public static int oduzimanje(int a, int b) {
		return a - b;
	}
	public static int mnozenje(int a, int b) {
		return a * b;
	}
	public static int deljenje(int a, int b) {
		return a / b;
	}
	
	  public static boolean isInteger(String s) {
	        try { 
	            Integer.parseInt(s); 
	        } catch(NumberFormatException e) { 
	            return false; 
	        }
	        // only got here if we didn't return false
	        return true;
	    }

	/*
	 * public static boolean isInteger(String s) { return isInteger(s); }
	 */

}