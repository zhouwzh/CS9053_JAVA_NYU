package PartIII;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Pair<K extends Number, V extends Number>{
	private K a;
	private V b;

	public Pair(K a, V b) {
		this.a = a;
		this.b = b;
	}

	public K getA(){
		return this.a;
	}

	public V getB(){
		return this.b;
	}

	public void setA(K a){
		this.a = a;
	}

	public void setB(V b){
		this.b = b;
	}
	
	public double euclidean(){
		return Math.sqrt(Math.pow((double)a,2.0)+Math.pow((double)b,2.0));
	}

	@Override
	public String toString(){
		return "["+a+","+b+"]";
	}

	public static void main(String[] args) {
		ArrayList<Pair<Double,Double>> pairs = new ArrayList<>();
		pairs.add(new Pair<>(3.0, 4.0));  //5.0
        pairs.add(new Pair<>(1.0, 1.0));  //1.41
        pairs.add(new Pair<>(0.0, 2.0));  //2.0
        pairs.add(new Pair<>(6.0, 8.0));  //10.0

		pairs.sort(Comparator.comparingDouble(Pair::euclidean));
		pairs.forEach(System.out::println);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int v1 = input.nextInt();
		// input.close();

		// Scanner input1 = new Scanner(System.in);
		System.out.print("Enter a double value: ");
		double v2 = input.nextDouble();

	}
}
