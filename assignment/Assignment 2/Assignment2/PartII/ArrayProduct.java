import java.util.Arrays;

class ArrayProduct {
	
	
	
	public static double[] arrayProduct(double[] array) {
		int n = array.length;
		double left = 1.0, right = 1.0;
		double[] res = new double[n];
		for(int i = 0;i<n;i++){
			res[i] = left;
			left *= array[i];
		}
		for(int i = n-1;i>=0;i--){
			res[i] *= right;
			right*=array[i];
		}
		return res;
	}
	
    
    public static void main(String[] args) {
    	double[] startingArray =   {1, 2, 3, 4 , 5};
		System.out.println("starting array is " + Arrays.toString(startingArray));
		System.out.println("output array is " + Arrays.toString(arrayProduct(startingArray)));
		System.out.println("");
    	// double[] result = arrayProduct(startingArray);
    	startingArray = new double[10];
    	for (int i=0;i<10;i++) {
    		startingArray[i] = Math.random()*10;
    	}
    	System.out.println("starting array is " + Arrays.toString(startingArray));
    	// double[] result = arrayProduct(startingArray);
    	System.out.println("output array is " + Arrays.toString(arrayProduct(startingArray)));
    }
}
