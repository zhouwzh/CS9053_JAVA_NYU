package items;

public class Magazine extends LibraryItem{
    private String issueTitle;
    private int issueNumber;

    public Magazine(){
        super();
    }
    public Magazine(long id, String title, String author, String publicationDate, boolean borrowable,String issueTitle,int issueNumber){
        super(id, issueTitle, author, publicationDate, false);
        this.issueTitle = issueTitle;
        this.issueNumber = issueNumber;
    }

    public String getIssueTitle(){
        return this.issueTitle;
    }
    public int getIssueNumber(){
        return this.issueNumber;
    }
    public void setIssueTitle(String it){
        this.issueTitle = it;
    }
    public void setIssueNumber(int in){
        this.issueNumber = in;
    }
    @Override
    public boolean isBorrowable(){
        return false;
    }
    @Override
    public void setBorrowable(boolean borrowable){
        return;
    }

    public String toString(){
        return "Magazine[" + super.toString() + ", issueTitle=" + this.issueTitle + ", issueNumber" + this.issueNumber +"]";
    }
    public boolean euqals(Object obj){
        if(this==obj) return true;
        if(obj instanceof Magazine){
            if(super.equals(obj)){
                Magazine that = (Magazine)obj;
                return issueTitle==that.issueTitle && issueNumber==that.issueNumber;
            }
        }
        return false;
    }
}
