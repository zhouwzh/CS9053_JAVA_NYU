package items;

public class DVD extends Video{
    private String resolution;
    private int region;
    private boolean extraFeatures;

    public DVD(){
        super();
    }
    public DVD(long id, String title, String author, String publicationDate, boolean borrowable, String director, int runtime, String resolution, int region, boolean extraFeatures){
        super(id, title, author, publicationDate, borrowable, director, runtime);
        this.resolution = resolution;
        this.region = region;
        this.extraFeatures = extraFeatures;
    }

    public String getResolution(){
        return this.resolution;
    }
    public int getRegion(){
        return this.region;
    }
    public boolean isExtraFeatures(){
        return this.extraFeatures;
    }
    public void setResolution(String resolution){
        this.resolution = resolution;
    }
    public void setRegion(int region){
        this.region = region;
    }
    public void setExtraFeatures(boolean ef){
        this.extraFeatures = ef;
    }

    public String toString(){
        return "DVD[" +super.toString() + ", resolution="+this.resolution+", region="+this.region+", extraFeatures="+this.extraFeatures+"]";
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof DVD){
            if(super.equals(obj)){
                DVD that = (DVD)obj;
                return resolution==that.resolution && region==that.region && extraFeatures==that.extraFeatures;
            }
        }
        return false;
    }
}
