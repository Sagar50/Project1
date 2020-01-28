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
                System.out.println("Enter a description of the new task.");
                String newTask = input.nextLine();
                tasks.add(newTask);
            } else if (response == 2) {
                System.out.println("Enter the index of the task to remove.");
                int removeTask = input.nextInt();
                input.nextLine();
                tasks.remove(removeTask);
            } else if (response == 3) {
                System.out.println("Enter the index of the task to update.");
                int index = input.nextInt();
                input.nextLine();
                if (index < tasks.size()) {
                    System.out.println("Enter the new description of the task.");
                    tasks.set(index, input.nextLine());
                }
            } else if (response == 4) {
                System.out.println(tasks);
            }
            else {
                break;
            }


        }

    }
}

