public class FlowRate {

	public static double calculateFlow(double R,double P,double mu,double L) {

		double pi = Math.PI;

		return (pi*P*Math.pow(R,4)/(8*mu*L));
	}
	
	public static void main(String[] args) {
		
		double R = 0.1;
		double P = 900.0;
		double mu = 1.002e-3;
		double L = 2.0;
		double flowRate = calculateFlow(R,P,mu,L);
		System.out.println("The total flowRate in m^3/s is: "+flowRate);

	}
}