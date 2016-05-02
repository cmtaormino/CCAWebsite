package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import logic.BusinessLogic;
import beans.*;

@RestController
public class ServiceController {
    
    @RequestMapping("/login")
    public Login login(@RequestParam(value="name") String name) {
        return BusinessLogic.getLogin(name);
    }
    
    @RequestMapping("/sendResetPasswordEmail")
    public void resetPassword(@RequestParam(value="email") String email) {
        return BusinessLogic.sendResetPasswordEmail(email);
    }
    
    @RequestMapping("/secruityKey")
    public boolean securityKey(@RequestParam(value="key") String key) {
        return BusinessLogic.checkKey(key);
    }
    
    @RequestMapping("/getBonus")
    public Bonus getBonus(@RequestParam(value="profileName") String profileName) {
        
        return BusinessLogic.getBonus(profileName);
    }
    
    @RequestMapping("/getAccountChanges")
    public String[] getAccountChanges() {
        
        return BusinessLogic.getAccountChanges();
    }
    
    @RequestMapping("/requestAccount")
    public void requestAccess(@RequestParam(value="firstName") String firstName, 
            @RequestParam(value="lastName") String lastName, 
            @RequestParam(value="email") String email, 
            @RequestParam(value="password") String password, 
            @RequestParam(value="company") String company, 
            @RequestParam(value="jobTitle") String jobTitle, 
            @RequestParam(value="department") String department, 
            @RequestParam(value="bio") String bio) {
        
        BusinessLogic.requestAccount(firstName, lastName, email, password, comapny, jobTitle, department, bio);
    }
    
    @RequestMapping("/projectList")
    public ProjectList projectList(@RequestParam(value="projects[]") String[] projects) {
        
        return BusinessLogic.getProjectList(projects);
    }
    
    @RequestMapping("/getTaskList")
    public ProjectList taskList(@RequestParam(value="tasks[]") String[] tasks, @RequestParam(value="type") String type) {
        
        return BusinessLogic.getTaskList(tasks, type);
    }
    
    @RequestMapping("/getAssignees")
    public String[] assignees() {
        
        return BusinessLogic.getAssignees();
    }
    
    @RequestMapping("/createTask")
    public void createTask(
            @RequestParam(value="assignee") String assignee,
            @RequestParam(value="start") String start,
            @RequestParam(value="end") String end,
            @RequestParam(value="desc") String desc,
            @RequestParam(value="points") int points) {
        
        BusinessLogic.createTask(assignee, start, end, desc, points);
    }
    
    @RequestMapping("/updateTask")
    public void updateTask(
            @RequestParam(value="assignee") String assignee,
            @RequestParam(value="start") String start,
            @RequestParam(value="end") String end,
            @RequestParam(value="desc") String desc,
            @RequestParam(value="points") int points) {
        
        BusinessLogic.updateTask(assignee, start, end, desc, points);
    }
    
    @RequestMapping("/getTask")
    public Task getTask(@RequestParam(value="taskName") String taskName,) {
        
        return BusinessLogic.getTask(taskName);
    }

    @RequestMapping("/createProject")
    public void createProject(@RequestParam(value="clientName") String clientName,
            @RequestParam(value="POCName") String POCName,
            @RequestParam(value="email") String email,
            @RequestParam(value="office") String office,
            @RequestParam(value="cell") String cell,
            @RequestParam(value="fax") String fax,
            @RequestParam(value="mailing") String mailing,
            @RequestParam(value="city") String city,
            @RequestParam(value="state") String state,
            @RequestParam(value="zip") String zip,
            @RequestParam(value="desc") String desc,
            @RequestParam(value="start") String start,
            @RequestParam(value="end") String end,
            @RequestParam(value="completed[]") String[] completed,
            @RequestParam(value="inPorgess") String[] inProgress,
            @RequestParam(value="pending") String[] pending) {
        
        BusinessLogic.createProject(clientName, POCName, email, office, cell, fax, mailing, city, state, zip, desc, start, end, completed, inProgress , pending);
    }

    @RequestMapping("/getProject")
    public Project getProject(@RequestParam(value="projectName") String projectName) {
        
        return BusinessLogic.getProject(projectName);
    }
    
    @RequestMapping("/updateProject")
    public void updateProject(@RequestParam(value="clientName") String clientName,
            @RequestParam(value="POCName") String POCName,
            @RequestParam(value="email") String email,
            @RequestParam(value="office") String office,
            @RequestParam(value="cell") String cell,
            @RequestParam(value="fax") String fax,
            @RequestParam(value="mailing") String mailing,
            @RequestParam(value="city") String city,
            @RequestParam(value="state") String state,
            @RequestParam(value="zip") String zip,
            @RequestParam(value="desc") String desc,
            @RequestParam(value="start") String start,
            @RequestParam(value="end") String end,
            @RequestParam(value="completed[]") String[] completed,
            @RequestParam(value="inPorgess") String[] inProgress,
            @RequestParam(value="pending") String[] pending) {
        
        BusinessLogic.updateProject(clientName, POCName, email, office, cell, fax, mailing, city, state, zip, desc, start, end, completed, inProgress , pending);
    }
    
    @RequestMapping("/getProfile")
    public Account getProfile(@RequestParam(value="projectName") String profileName) {
        
        return BusinessLogic.getProfile(profileName);
    }
    
    @RequestMapping("/updateProfile")
    public void updateProfile(@RequestParam(value="firstName") String firstName, 
            @RequestParam(value="lastName") String lastName, 
            @RequestParam(value="email") String email, 
            @RequestParam(value="password") String password, 
            @RequestParam(value="company") String company, 
            @RequestParam(value="jobTitle") String jobTitle, 
            @RequestParam(value="department") String department, 
            @RequestParam(value="bio") String bio) {
        
        BusinessLogic.updateProfile(firstName, lastName, email, password, comapny, jobTitle, department, bio);
    }
    
    @RequestMapping("/createProfile")
    public void createProfile(@RequestParam(value="firstName") String firstName, 
            @RequestParam(value="lastName") String lastName, 
            @RequestParam(value="email") String email, 
            @RequestParam(value="password") String password, 
            @RequestParam(value="company") String company, 
            @RequestParam(value="jobTitle") String jobTitle, 
            @RequestParam(value="department") String department, 
            @RequestParam(value="bio") String bio) {
        
        BusinessLogic.createProfile(firstName, lastName, email, password, comapny, jobTitle, department, bio);
    }
}