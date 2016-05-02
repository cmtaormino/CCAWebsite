
package beans;


public class ProjectList {
    private long id;
    private Project[] projects;
    
    public ProjectList(){
        id = 0;
    }
    
    public ProjectList(long id, Project[] projects){
        this.id = id;
        this.projects = projects;
    }
    
    public long getId(){
        return this.id;
    }
    public Project[] getProjects(){
        return this.projects;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setProjects(Project[] projects){
        this.projects = projects;
    }
}
