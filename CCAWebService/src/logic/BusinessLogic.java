package logic;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import beans.*;


public class BusinessLogic {

    public static Login getLogin(String name){
        String password = Database.getPassword(name); 
        return new Login(0, name, password);
    }
    
    public static void sendResetPasswordEmail(String email){
        String from = "donotreply@CCA.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("CCA Startegic Media Password Reset Request");
            message.setText("Your password has been reset, ");
            Transport.send(message);
        }catch (MessagingException mex){
            mex.printStackTrace();
        }
    }
    
    public static boolean checkKey(String key){
        return Database.getKey(key);
    }
    
    public static Bonus getBonus(String profileName){
        int actualBonus = Database.getAcutalBonus(profileName);
        int potentialBonus = Database.getPotentialBonus(profileName);
        
        return new Bonus(0, potentialBonus, actualBonus);
    }
    
    public static AccountList getAccountChanges(){

        ArrayList<Account> accountList = Database.getPendingAccountChanges();
        
        return new AccountList(0, (account[])accountList.toArray());
    }
    
    public static void requestAccount(String firstName, String lastName, String email, String password, String company, String jobTitle, String department, String bio){
        Database.createAccountRequest(firstName, lastName, email, password, company, jobTitle, department, bio);
    }
    
    public static ProjectList getProjectList(String[] projects){
        ArrayList<Project> projectList = new ArrayList<Project>();
        
        for(int i = 0; i < projects.length; i++){
            projectList.add(Database.getProject(projects[i]));
        }
        
        return new ProjectList(0, (Project)projectList.toArray());
    }
    
    public static TaskList getTaskList(String[] tasks, String type, String projectName){
        ArrayList<Project> taskList = new ArrayList<Project>();
        
        for(int i = 0; i < tasks.length; i++){
            taskList.add(Database.getTaskList(tasks[i], type, projectName));
        }
        
        return null;
    }
    
    public static StringList getAssignees(){
        return null;
    }
    
    public static void createTask(String assignee, String start, String end, String desc, int points){
    }
    
    public static void updateTask(String assignee, String start, String end, String desc, int points){
    }
    
    public static Task getTask(String taskName){
        return null;
    }

    public static void createProject(String clientName, String POCName, String email, String office, String cell, String fax, String mailing, String city, String state, String zip, String desc, String start, String end, String[] completed, String[] inProgress, String[] pending){
    }

    public static Project getProject(String projectName){
        return null;
    }
    
    public static void updateProject(String clientName, String POCName, String email, String office, String cell, String fax, String mailing, String city, String state, String zip, String desc, String start, String end, String[] completed, String[] inProgress , String[] pending){
    }
    
    public static Account getProfile(String profileName){
        return null;
    }
    
    public static void updateProfile(String firstName, String lastName, String email, String password, String company, String jobTitle, String department, String bio){
    }
    
    public static void createProfile(String firstName, String lastName, String email, String password, String company, String jobTitle, String department, String bio){
    }
}
