package items;

public class Video extends LibraryItem{
    private String director;
    private int runtime;

    public Video(){
        super();
    }
    public Video(long id, String title, String author, String publicationDate, boolean borrowable,String director,int runtime){
        super(id, title, author, publicationDate, borrowable);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector(){
        return director;
    }
    public int getRuntime(){
        return runtime;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

    public String toString(){
        return "Video["+super.toString()+", director="+this.director+", runtime="+this.runtime+"]";
    }
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj instanceof Video){
            if(super.equals(obj)){
                Video that = (Video)obj;
                return director==that.director && runtime==that.runtime;
            }
        }
        return false;
    }
}
