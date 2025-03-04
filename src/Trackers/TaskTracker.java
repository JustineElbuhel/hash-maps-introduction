package Trackers;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker(){
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise){
        //Initialize an empty list for a new user IF one has not already been added
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        //Retrieve the list containing the exercises completed by the user and add to it
        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercise);

        // ^ can also be written as:
        // this.completedExercises.get(user).add(exercise);
    }

    public void print(){
        for(String name : completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }

    public static void main(String[] args){
        TaskTracker tracker = new TaskTracker();

        tracker.add("Ada", 1);
        tracker.add("Ada", 2);
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);

        tracker.add("Peppa", 6);
        tracker.add("Peppa", 7);

        tracker.add("Tokki", 9);
        tracker.add("Tokki", 9);
        tracker.add("Tokki", 9);

        tracker.print();
    }
}
