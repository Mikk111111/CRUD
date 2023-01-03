package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mainArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        mainArr.add("sdsad");
        mainArr.add("sdsssad");
        boolean isWorking = true;
        int command = 0;
        int num;
        while(isWorking)
        {
            menu();
            System.out.println("Enter what to do:");
            try{
                command = sc.nextInt();
                sc.nextLine();
            }catch (Exception e)
            {
                sc.nextLine();
                command = 0;
                System.out.println("Didn't catch that, try again");
            }
            switch(command)
            {
                case 1:
                    print(mainArr);
                    break;
                case 2:
                    System.out.println("Add name:");
                    add(sc.nextLine(),mainArr);
                    break;
                case 3:
                    System.out.println("Which one: 1-"+mainArr.size());
                    try{
                        num = sc.nextInt();
                        sc.nextLine();
                        System.out.println("New name:");
                        edit(sc.nextLine(),num,mainArr);
                        System.out.println("aciu, suvedem");
                    }catch (Exception e)
                    {
                        sc.nextLine();
                        System.out.println("Didn't catch that, closing");
                    }
                    break;
                case 4:
                    System.out.println("Which one: 1-"+mainArr.size());
                    try{
                        num = sc.nextInt();
                        sc.nextLine();
                        delete(num,mainArr);
                    }catch (Exception e)
                    {
                        sc.nextLine();
                        System.out.println("Didn't catch that, closing");
                    }
                    break;
                case 5:
                    isWorking=false;
                    System.out.println("Ending work");
                    break;
                default:
                    System.out.println("Something went wrong");
            }
        }
    }
    public static void menu()
    {
        System.out.println("Choose what to do:");
        System.out.println("1. Print names");
        System.out.println("2. Add name");
        System.out.println("3. Edit name");
        System.out.println("4. Delete name");
        System.out.println("5. Exit application");
    }

    public static void print(ArrayList<String> arr)
    {
        System.out.println(arr);
    }

    public static void add(String name,ArrayList<String> arr)
    {
        arr.add(name);
    }

    public static void edit(String name, int num,ArrayList<String> arr)
    {
        arr.set(num - 1,name);
    }

    public static void delete(int num,ArrayList<String> arr)
    {
        arr.remove(num - 1);
    }
}