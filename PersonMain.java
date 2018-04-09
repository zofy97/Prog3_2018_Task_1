package Task_1;

import java.util.Scanner;

public class PersonMain {

    public static void main (String[] args)     {

        Scanner scan = new Scanner(System.in);

        Person [] person = new Person [50];

        int count = 0;

        while (person.length == 50) {

            System.out.println("Choose:");
            System.out.println("1) Create new Person");
            System.out.println("2) Print all existing people");
            System.out.println("3) Print all existing people sorted by type");
            System.out.println("4) Search for a person");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    choice = 1;
                { if (count < 50)   {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Student? Employee? Studentworker?");
                    String type = scanner.next();

                    if(type.equals("Student"))  {
                        Student s = new Student();
                    } else if (type.equals("Employee")) {
                        Employee e = new Employee();
                    } else if (type.equals("Studentworker"))    {
                        StudentWorker sw = new StudentWorker();
                    } else {
                        System.out.println("Invalid Entry");
                    }
                }

            }
        }
    }
}
