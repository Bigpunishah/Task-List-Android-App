package com.example.tasklist;

public class Task {
    private int taskId;
    private int listId;
    private String name;
    private String notes;
    private String completedDate;
    private String hidden;

    //Define constants used as Bool values by the constructors
    public static final String TRUE = "1";
    public static final String FALSE = "0";

    public Task(){
        name = "";
        notes = "";
        completedDate = FALSE;
        hidden = FALSE;
    }//end Task constructor

    public Task(int listId, String name, String notes, String completed, String hidden){
        this.listId = listId;
        this.name = name;
        this.notes = notes;
        this.completedDate = completed;
        this.hidden = hidden;
    }//end Task constructor

    public Task(int taskId, int listId, String name, String notes, String completed, String hidden){
        this.taskId = taskId;
        this.listId = listId;
        this.name = name;
        this.notes = notes;
        this.completedDate = completed;
        this.hidden = hidden;
    }//end Task constructor

    //setters
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public void setCompletedDate(Long millis){
        this.completedDate = Long.toString(millis);
    }

    //getters
    public int getTaskId() {
        return taskId;
    }

    public int getListId() {
        return listId;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public String getHidden() {
        return hidden;
    }

    public Long getCompletedMillis(){
        return Long.valueOf(completedDate);
    }
}
