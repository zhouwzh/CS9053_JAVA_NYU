package problem2;

public class Library {
    private String name;
    private String city;
    private String state;
    private static int CAPACITY = 10;
    private Book[] books;
    private int[] lent;
    private int count;

    public Library(String name, String city, String state){
        this.name = name;
        this.city = city;
        this.state = state;
        this.books = new Book[CAPACITY];
        this.lent = new int[CAPACITY];
        this.count = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public Book[] getBooks(){
        return this.books;
    }

    public int totalBooks(){
        return this.count;
    }

    public Book lendBook(int id){
        for(int i = 0; i < count; i++){
            if(books[i].getId() == id && lent[i] == 1){
                lent[i] = 0;
                return books[i];
            }
        }
        return null;
    }

    public boolean returnBook(int id){
        for(int i =0;i<count;i++){
            if(books[i].getId() == id && lent[i]==0){
                lent[i] = 1;
                return true;
            }
        }
        return false;
    }

    public Book[] booksInStock(){
        int stock = 0;
        for(int i = 0;i<count;i++){
            if(lent[i] == 1){
                stock++;
            }
        }
        Book[] res = new Book[stock];
        int j = 0;
        for(int i = 0;i<count;i++){
            if(lent[i]==1){
                res[j++] = books[i];
            }
        }
        return res;
    }

    public boolean addBook(Book book){
        if(this.count>=CAPACITY){
            return false;
        }
        books[count] = book;
        lent[count] = 1;//1 store, 0 lent
        count++;
        return true;
    }

    public boolean removeBook(int id){
        for(int i = 0;i<count;i++){
            if(books[i].getId() == id){
                if(lent[i]==1){
                    for(int j = i;j<count-1;j++){
                        books[j] = books[j+1];
                        lent[j] = lent[j+1];
                    }
                    books[count] = null;
                    count--;
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
