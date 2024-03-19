package com.example.tasklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Database & StringBuilder objects
        TaskListDB db = new TaskListDB(this);
        StringBuilder sb = new StringBuilder();

        //insert task
        Task task = new Task(1, "Make dentist appointment", "", "0", "0");
        long insertId = db.insertTask(task);

        if(insertId > 0){
            sb.append("Row inserted! Insert Id; " + insertId + "\n");
        }//end insert task 1

        //Insert second task
        Task task2 = new Task(1, "Take car in for oil change", "", "0", "0");
        long insertId2 = db.insertTask(task2);
        if(insertId2 > 0){
            sb.append("Row inserted! Insert Id: " + insertId2 + "\n");
        }//end insert task 2

        //update task
        task.setTaskId((int) insertId);
        task.setName("Update test");
        int updateCount = db.updateTask(task);
        if(updateCount == 1){
            sb.append("Task updated! Update count: " + updateCount + "\n");
        }//end update task

        //delete task
        int deleteCount = db.deleteTask(insertId);
        if(deleteCount == 1){
            sb.append("Task deleted! Delete count: " + deleteCount + "\n\n");
        }//end delete task

        //delete old task
        db.deleteTask(5);
        db.deleteTask(7);
        //end delete old task

        //display all tasks (id + name)
        ArrayList<Task> tasks = db.getTasks("Personal");
        for(Task t : tasks){
            sb.append(t.getTaskId() + "|" + t.getName() + "\n");
        }//end display all tasks

        //display string on UI
        TextView taskListTextView = (TextView) findViewById(R.id.taskListTextView);
        taskListTextView.setText(sb.toString());
    }//emd onCreate
}//end MainActivity