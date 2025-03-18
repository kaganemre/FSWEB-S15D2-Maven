package org.example.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        Set<Task> allTasks = new LinkedHashSet<>();

        switch (name.toLowerCase()) {
            case "ann":
                allTasks.addAll(annsTasks);
                break;
            case "bob":
                allTasks.addAll(bobsTasks);
                break;
            case "carol":
                allTasks.addAll(carolsTasks);
                break;
            case "all":
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                allTasks.addAll(unassignedTasks);
                break;
            default:
                System.out.println("Invalid name provided.");
                break;
        }

       return allTasks;
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        set1.addAll(set2);
        return set1;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        set1.removeAll(set2);
        return set1;
    }

}
