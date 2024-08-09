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
  
    private  int id ;
    private  String description;
    private  boolean complete;
    private  User user;
    private  ArrayList<Comment> listComment;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
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

    public Task(int id, String description,User user, ArrayList<Comment> listComment) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.listComment = listComment;
    }

    public Task() {
        this(0,"",new User(),new ArrayList());
    }
    
    
    
    
}
