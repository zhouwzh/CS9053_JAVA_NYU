
public class  EstimateZeta2 {

	public static double estimateZeta2(int n) {
		double sum = 0.0;
		// int n = 10000;
		for(int i = 1; i <= n; i++){
			sum += 1/((double)i*i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 245891;
		System.out.println("Zeta(2) is estimated as <" + estimateZeta2(n) + "> after <" + n + "> iterations");
	}
}
