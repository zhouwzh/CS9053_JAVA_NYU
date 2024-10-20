package items;

public class Music extends LibraryItem{
    private int numberOfTracks;

    public Music(){
        super();
    }
    public Music(long id, String title, String author, String publicationDate, boolean borrowable,int numberOfTracks){
        super(id, title, author, publicationDate, borrowable);
        this.numberOfTracks = numberOfTracks;
    }

    public int getNumberOfTracks(){
        return numberOfTracks;
    }
    public void setNumberOfTracks(int numberOfTracks){
        this.numberOfTracks = numberOfTracks;
    }

    public String toString(){
        return "Music["+super.toString()+", numberOftracks="+this.numberOfTracks+"]";
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof Music){
            if(super.equals(obj)){
                Music that = (Music)obj;
                return numberOfTracks ==that.numberOfTracks;
            }
        }
        return false;
    }
}
