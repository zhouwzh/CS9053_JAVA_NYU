package items;

public class CD extends Music{
    private boolean enhanced;
    private boolean mini;

    public CD(){
        super();
    }
    public CD(long id,String title, String author, String publicationDate, boolean borrowable,int numberOfTracks,boolean enhanced,boolean mini){
        super(id,title, author, publicationDate, borrowable, numberOfTracks);
        this.enhanced = enhanced;
        this.mini = mini;
    }
     
    public boolean isEnhanced(){
        return this.enhanced;
    }
    public boolean isMini(){
        return this.mini;
    }
    public void setEnhanced(boolean e){
        this.enhanced = e;
    }
    public void setMini(boolean mini){
        this.mini = mini;
    }

    public String toString(){
        return "DC[" + super.toString() + ", enhanced=" + this.enhanced +", mini=" + this.mini + "]";
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof CD){
            if(super.equals(obj)){
                CD that = (CD)obj;
                return enhanced==that.enhanced && mini==that.mini;
            }
        }
        return false;
    }
}
