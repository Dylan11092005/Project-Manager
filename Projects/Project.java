/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.ArrayList;

/**
 *
 * @author DYLAN
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Task> listTask;
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getListTask() {
        return listTask;
    }
    
    public void addTask(Task object) {
        listTask.add(object);
    }
    
    public void deleteTask(int id) {
        listTask.removeIf(task -> task.getId() == id);
    }
    

    public Project(int id, String name, ArrayList<Task> listTask) {
        this.id = id;
        this.name = name;
        this.listTask = new ArrayList<>();
    }

    public Project() {
        this(0, null, new ArrayList<Task>());
    }
    
    public int countTask(){
        return this.listTask.size();
    }
    
    public completeTask{
    long completeTask= listTask.stream().filter(Task::isComplete.count();
}
    
    public complete
            
    
}
