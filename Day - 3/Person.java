package Day_3_Solution;

import java.util.Scanner;

public class Person {
    // TODO: Define the 'Person' class with 'name' and 'age' member variables
    String name;
    int age;

    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        // TODO: Write your code here
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        p.name = sc.nextLine();
        System.out.println();
        p.age = sc.nextInt();
        p.printInfo();
    }
}