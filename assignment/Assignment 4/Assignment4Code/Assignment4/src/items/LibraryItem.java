package items;

// import library.Library;

public class LibraryItem {
	private String title;
	private String author;
	private String publicationDate;
	private boolean borrowable;

	private long itemID;
	// private static long next_id = 0;

	public LibraryItem(){
		// this.itemID = next_id;
		// next_id++;
	}
	public LibraryItem(long id, String title, String author, String publicationDate, boolean borrowable) {
		this();
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.borrowable = borrowable;
		this.itemID = id;
	}

	public String getTitle(){return this.title;}
	public String getAuthor(){return this.author;}
	public String getPublicationDate(){return publicationDate;}
	public long getItemID(){return itemID;}
	public boolean isBorrowable(){return borrowable;}

	public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setPublicationDate(String publicationDate) {this.publicationDate = publicationDate;}
    public void setItemID(long itemID) {this.itemID = itemID;}
    public void setBorrowable(boolean borrowable) {this.borrowable = borrowable;}

	@Override
	public String toString(){
		return "LibraryItem[ItemId=" + itemID +", Title=" + title + ", Author=" + author + ", PublicationDate=" + publicationDate 
               + ", Borrowable=" + borrowable + "]";
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		LibraryItem that = (LibraryItem) obj;
		return title==that.getTitle() && author==that.getAuthor() && publicationDate==that.getPublicationDate() && itemID==that.getItemID() && borrowable==that.isBorrowable();
	}
}
