/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comments.Comment;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class Task {
   public static final char COMP = 'C' , NOCOMP = 'N';
    private  int id ;
    private  String description;
    private  char complete;
    private  User user;
    private  ArrayList<Comment> listComment;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComplete() {
         switch (complete) {
            case COMP -> {
                return "completado";
            }
            case NOCOMP -> {
                return "no completado";
            }
           
        }
         return null;
    }

    public void setComplete(char complete) {
        complete = Character.toUpperCase(complete);
         
        if (complete == 'C' || complete == 'N') {
            this.complete = complete;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Comment> getListComment() {
        return listComment;
    }

    
    public void addComment (Comment object){
        this.listComment.add(object);
        
    
    }
    
    public void deleteComment (int object){
        this.listComment.removeIf(comment -> comment.getId() == object);
    }
    
    
    
    
}
