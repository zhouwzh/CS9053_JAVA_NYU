package problem2;

public final class Book {
    private static int nextId;
    private int id = ++nextId;
    private final String author;
    private final String title;
    private final int pages;
    private final int yearPublished;
    private final boolean hardcover;

    public Book(String author, String title, int pages, int yearPublished, boolean hardcover){
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.hardcover = hardcover;
    }

    public int getId(){
        return this.id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTittle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYearpublished(){
        return this.yearPublished;
    }
    public boolean getHardcover(){
        return this.hardcover;
    }
}
