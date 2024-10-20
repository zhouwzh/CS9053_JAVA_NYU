package items;

public class Referencebook extends Book{
    private int volume;
    // private boolean borrowable;

    public Referencebook(){
        super();
    }

    public Referencebook(long id, String title, String author, String publicationDate, boolean borrowable,int pages,String genre,int volume){
        super(id, title,author,publicationDate,false,pages,genre);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
    public void serPages(int volume){
        this.volume = volume;
    }
    @Override
    public boolean isBorrowable(){
        return false;
    }
    @Override
    public void setBorrowable(boolean borrowable){
        System.out.println("Item Referencebook is constrained to be unborrowable");
        return;
    }
    
    public String toString(){
        return "ReferenceBook["+super.toString()+", volume="+this.volume+"]";
    }
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj instanceof Referencebook){
            if(super.equals(obj)){
                Referencebook that = (Referencebook)obj;
                return volume==that.volume;
            }
        }
        return false;
    }

}
