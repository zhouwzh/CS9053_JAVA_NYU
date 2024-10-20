package items;

public class Book extends LibraryItem{
    private int pages;
    private String genre;

    public Book(){
        super();
    }

    public Book(long id, String title, String author, String publicationDate, boolean borrowable,int pages,String genre){
        super(id,title,author,publicationDate,borrowable);
        this.pages = pages;
        this.genre = genre;
    }

    public int getPages(){
        return pages;
    }
    public String getGenre(){
        return genre;
    }
    public void serPages(int pages){
        this.pages = pages;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public String toString(){
        return "Book["+super.toString()+", pages="+this.pages+", genre="+this.genre+"]";
    }
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj instanceof Book){
            if(super.equals(obj)){
                Book that = (Book)obj;
                return pages==that.pages && genre==that.genre;
            }
        }
        return false;
    }

}
