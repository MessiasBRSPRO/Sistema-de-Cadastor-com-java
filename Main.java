import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList<Person> personList = new ArrayList<>();

    int out = 1;

    System.out.println("==========================");
    System.out.println("[1]Register new Person\n[2]See the Person list" +
            "\n[3]Remove a person\n[4]exit of Application");
    System.out.println("==========================");
    while(out != 0){
      System.out.println("Whats you will do?");
      int choice = input.nextInt();
      switch (choice){
        case 1:
          System.out.println("Name of person");
          String name = input.next();
          System.out.println("Age of " +name);
          int age = input.nextInt();
          System.out.println("Height of " +name);
          double height = input.nextDouble();;
          Person person = new Person(name, age, height);
          personList.add(person);
          System.out.println("+1 person added");
          break;
        case 2:
          System.out.println("Person List actually");
          for (Person persons: personList) {
            System.out.println("==========================");
            System.out.println(persons);
          }
          break;
        case 3:
          System.out.println("Person's name registered");
          for(Person persons : personList){
            System.out.println(persons.getName());
          };
          System.out.println("Insert the index of a person to remove");
          int removePerson = input.nextInt();
          personList.remove(removePerson);
          System.out.println("person removed! Array are actuallized");
      };

    };
  };
};
