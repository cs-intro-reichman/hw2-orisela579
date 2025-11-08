// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double x = 3;
		double aprox = 1;
		if(num%2==0) {
			for(int i=1; i<num/2.0; i++){
				aprox = aprox - (1 / x);
				x += 2;
				aprox = aprox + (1 / x);
				x += 2;
			}
			aprox = aprox - (1 / x );
		}
		else{
			for(int i=1; i<num/2.0; i++){
				aprox = aprox - (1 / x);
				x += 2;
				aprox = aprox + (1 / x);
				x += 2;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + aprox*4.0);
	}
}
