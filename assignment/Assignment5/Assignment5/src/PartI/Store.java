package PartI;
import java.util.ArrayList;

public class Store {
	public static void main(String[] args) {
		Store store = new Store();
		
		store.addProduct(store.new Electronics("IPhone16",1000,24));
		store.addProduct(store.new Electronics("xiaomi15 Ultra", 800, 18));
		store.addProduct(store.new Clothing("shirt", 20, 185));
		store.addProduct(store.new Clothing("overcoat", 100, 190));

		store.showDiscountPrices();
	}

	private ArrayList<Product> products;
	public Store() {
		products = new ArrayList<>();
	}

	public void addProduct(Product product){
		products.add(product);
	}

	public void showDiscountPrices(){
		for(Product product : products){
			System.out.println("ProductName="+product.getName() + ", OriginalPrice="+product.getPrice()+", DiscountedPrice= " + product.calculateDiscountPrice());
		}
	}

	abstract class Product{
		protected String name;
		protected double price;
		public Product(String name, double price){
			this.name = name;
			this.price = price;
		}
		
		public abstract double calculateDiscountPrice();
		
		public String getName(){return this.name;}
		public double getPrice(){return this.price;}
	}

	class Electronics extends Product{
		public int warrantyPeriod;
		// private double discount = 0.1;
		public Electronics(String name,double price,int warrantyPeriod){
			super(name, price);
			this.warrantyPeriod = warrantyPeriod;
		}
		@Override
		public double calculateDiscountPrice(){
			return this.price * 0.9;
		}
	}

	class Clothing extends Product{
		public int size;
		public Clothing(String name, double price,int size){
			super(name,price);
			this.size = size;
		}
		@Override
		public double calculateDiscountPrice(){
			return this.price * 0.85;
		}
	}
}
