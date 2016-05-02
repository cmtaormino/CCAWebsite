
package beans;

public class Task {
    private long id;
    private String assignee;
    private String start;
    private String end;
    private String desc;
    private int points;
    
    public Task(){
        id = 0;
    }
    
    public Task(long id, String assignee, String start, String end, String desc, int points){
        this.id = id;
        this.assignee = assignee;
        this.start = start;
        this.end = end;
        this.desc = desc;
        this.points = points;
    }
    
    public long getId(){
        return this.id;
    }
    public String getAssignee(){
        return this.assignee;
    }
    public String getStart(){
        return this.start;
    }
    public String getEnd(){
        return this.end;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getPoints(){
        return this.points;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setAssginee(String asignee){
        this.assignee = assignee;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setEnd(String end){
        this.end = end;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setPoints(int points){
        this.points = points;
    }
}
