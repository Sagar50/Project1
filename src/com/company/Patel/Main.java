//Sagar Patel, CSCI1660, 1/28/2020
package com.company.Patel;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        int response;
        while (true) {
            System.out.println("Please choose an option: ");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all task.");
            System.out.println("(0) Exit.");
            response = input.nextInt();
            input.nextLine();
            if (response != 1 && response != 2 && response != 3 && response != 4 && response != 0) {
                System.out.println("Please enter the correct number.");
                response = input.nextInt();
            }
            if (response == 1) {
                String[] toAddTD = addingTasks();
                String taskDescr = toAddTD[0] + ": " + toAddTD[1];
                tasks.add(taskDescr);
            } else if (response == 2) {
                tasks.remove(removeTask());
            } else if (response == 3) {
                String[] updateValues = updateTask();
                int toSetIndex = Integer.parseInt(updateValues[0]);
                if (toSetIndex < tasks.size()) {
                    String newTaskDescr = updateValues[1] + ": " + updateValues[2];
                    tasks.set(toSetIndex, newTaskDescr);
                }
            } else if (response == 4) {
                System.out.println(" ");
                for (String task : tasks) {
                    System.out.println(task);
                }
                System.out.println(" ");
            }
            else {
                break;
            }
        }
    }
    public static String[] addingTasks() {
        System.out.println("What is the task you want to add?");
        String newTask = input.nextLine();
        System.out.println("What is the description of the task?");
        String description = input.nextLine();
        return new String[]{newTask, description};
    }
    public static int removeTask() {
        System.out.println("Enter the index of the task to remove.");
        int removeTask = input.nextInt();
        input.nextLine();
        return removeTask;
    }
    public static String[] updateTask() {
        System.out.println("Enter the index of the task to update.");
        String index = input.nextLine();
        System.out.println("Enter the new task.");
        String task = input.nextLine();
        System.out.println("Enter the description of the new task.");
        String newDescr = input.nextLine();
        return new String[]{index, task, newDescr};
    }
}

