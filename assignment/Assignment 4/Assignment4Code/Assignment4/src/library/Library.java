package library;
import items.*;
import java.util.ArrayList;

public class Library {
	private ArrayList<LibraryItem> items;
	private String name;
	private String city;
	private String state;
	private static int CAPACITY = 10;
	private int[] lent;
	private int count;

	public Library() {
	}

	public Library(String name, String city, String state){
		this.name = name;
		this.city = city;
		this.state = state;
		this.lent = new int[CAPACITY];
		this.items = new ArrayList<>();
		this.count = 0;
	}
	public String toString(){
		return "Library["+"name="+this.name+", city="+this.city+", state="+this.state+", StockItemsNumber="+this.count+"]";
	}
	public String getName(){return this.name;}
    public String getCity(){return this.city;}
    public String getState(){return this.state;}
    public ArrayList<LibraryItem> getItems(){return this.items;}
    public int totalBooks(){return this.count;}

	public LibraryItem lendItem(int id){
        for(int i = 0; i < count; i++){
            if(items.get(i).getItemID() == id && lent[i] == 1){
				if(items.get(i).isBorrowable()){
					lent[i] = 0;
                	return items.get(i);
				}
            }
        }
        return null;
	}

	public boolean returnItem(int id){
		for(int i =0;i<count;i++){
            if(items.get(i).getItemID() == id && lent[i]==0){
                lent[i] = 1;
                return true;
            }
        }
        return false;
	}

	public ArrayList<LibraryItem> itemsInStock(){
        ArrayList<LibraryItem> res = new ArrayList<>();
        for(int i = 0;i<count;i++){
            if(lent[i]==1){
                res.add(items.get(i));
            }
        }
        return res;
	}

	public boolean addItem(LibraryItem item){
		if(this.count >= CAPACITY){
			return false;
		}
		items.add(item);
		lent[count] = 1;
		count ++;
		return true;
	}

	public boolean removeItem(int id){
		for(int i = 0;i<count;i++){
			if(items.get(i).getItemID() == id){
				if(lent[i] == 1){
					items.remove(i);
					for(int j = i;j<count-1;j++){
                        lent[j] = lent[j+1];
                    }
                    count--;
                    return true;
				}
				else{
					return false;
				}
			}
		}
		return false;
	}
}
