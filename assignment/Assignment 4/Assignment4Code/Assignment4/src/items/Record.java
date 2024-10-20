package items;

public class Record extends Music{
    private String type;
    private String speed;
    private boolean stereo;

    public Record(){
        super();
    }
    public Record(long id, String title, String author, String publicationDate, boolean borrowable,int numberOfTracks,String type,String speed,boolean stereo){
        super(id, title, author, publicationDate, borrowable, numberOfTracks);
        this.type = type;
        this.speed = speed;
        this.stereo = stereo;
    }
     
    public String getType(){
        return this.type;
    }
    public String speed(){
        return this.speed;
    }
    public boolean getStereo(){
        return this.stereo;
    }
    public void setType(String type){
        this.type = type;
    }
    public void serSpeed(String speed){
        this.speed = speed;
    }
    public void setStereo(boolean stereo){
        this.stereo = stereo;
    }

    public String toString(){
        return "Record[" + super.toString() + ", type=" + this.type +", speed=" + this.speed + ", stereo="+this.stereo+"]";
    }
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj instanceof Record){
            if(super.equals(obj)){
                Record that = (Record)obj;
                return type==that.type && speed==that.speed && stereo==that.stereo;
            }
        }
        return false;
    }
}
