package Task_1;

import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person[] person = new Person[50];

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
                {
                    if (count < 50) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Student? Employee? Studentworker? ");
                        String type = scanner.next();

                        if (type.equals("Student")) {
                            Student s = new Student();
                            System.out.println("Enter Firstname: ");
                            s.setFirstname(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Lastname: ");
                            s.setLastname(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Age: ");
                            s.setAge(scanner.nextInt());
                            scanner.reset();
                            System.out.println("Enter free Workday: ");
                            System.out.println("1) Monday\n2) Tuesday\n3) Wednesday\n4) Thursday\n5) Friday\n6) Saturday\n7) Sunday");
                            int day = scan.nextInt();
                            scanner.reset();
                            switch(day) {
                                case 1: day = 1;    {
                                    s.setFreeWorkday(Workdays.MONDAY);
                                }
                                case 2: day = 2;    {
                                    s.setFreeWorkday(Workdays.TUESDAY);
                                }
                                case 3: day = 3;    {
                                    s.setFreeWorkday(Workdays.WEDNESDAY);
                                }
                                case 4: day = 4;    {
                                    s.setFreeWorkday(Workdays.THURSDAY);
                                }
                                case 5: day = 5;    {
                                    s.setFreeWorkday(Workdays.FRIDAY);
                                }
                                case 6: day = 6;    {
                                    s.setFreeWorkday(Workdays.SATURDAY);
                                }
                                case 7: day = 7;    {
                                    s.setFreeWorkday(Workdays.SUNDAY);
                                }
                            }
                            scanner.reset();
                            System.out.println("Enter University: ");
                            s.setUniversity(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Course: ");
                            s.setCourse(scanner.next());
                            scanner.reset();
                            person[count] = s;
                            count++;
                        } else if (type.equals("Employee")) {
                            Employee e = new Employee();
                            System.out.println("Enter Firstname: ");
                            e.setFirstname(scanner.next());
                            System.out.println("Enter Lastname: ");
                            e.setLastname(scanner.next());
                            System.out.println("Enter Age: ");
                            e.setAge(scanner.nextInt());
                            System.out.println("Enter free Workday: ");
                            System.out.println("1) Monday\n2) Tuesday\n3) Wednesday\n4) Thursday\n5) Friday\n6) Saturday\n7) Sunday");
                            int day = scan.nextInt();
                            switch(day) {
                                case 1: day = 1;    {
                                    e.setFreeWorkday(Workdays.MONDAY);
                                }
                                case 2: day = 2;    {
                                    e.setFreeWorkday(Workdays.TUESDAY);
                                }
                                case 3: day = 3;    {
                                    e.setFreeWorkday(Workdays.WEDNESDAY);
                                }
                                case 4: day = 4;    {
                                    e.setFreeWorkday(Workdays.THURSDAY);
                                }
                                case 5: day = 5;    {
                                    e.setFreeWorkday(Workdays.FRIDAY);
                                }
                                case 6: day = 6;    {
                                    e.setFreeWorkday(Workdays.SATURDAY);
                                }
                                case 7: day = 7;    {
                                    e.setFreeWorkday(Workdays.SUNDAY);
                                }
                            }
                            System.out.println("Enter Workplace: ");
                            e.setWorkplace(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Salary: ");
                            e.setSalary(scanner.nextInt());
                            scanner.reset();
                            person[count] = e;
                            count++;
                        } else if (type.equals("Studentworker")) {
                            StudentWorker sw = new StudentWorker();
                            System.out.println("Enter Firstname: ");
                            sw.setFirstname(scanner.next());
                            System.out.println("Enter Lastname: ");
                            sw.setLastname(scanner.next());
                            System.out.println("Enter Age: ");
                            sw.setAge(scanner.nextInt());
                            System.out.println("Enter free Workday: ");
                            System.out.println("1) Monday\n2) Tuesday\n3) Wednesday\n4) Thursday\n5) Friday\n6) Saturday\n7) Sunday");
                            int day = scan.nextInt();
                            switch(day) {
                                case 1: day = 1;    {
                                    sw.setFreeWorkday(Workdays.MONDAY);
                                }
                                case 2: day = 2;    {
                                    sw.setFreeWorkday(Workdays.TUESDAY);
                                }
                                case 3: day = 3;    {
                                    sw.setFreeWorkday(Workdays.WEDNESDAY);
                                }
                                case 4: day = 4;    {
                                    sw.setFreeWorkday(Workdays.THURSDAY);
                                }
                                case 5: day = 5;    {
                                    sw.setFreeWorkday(Workdays.FRIDAY);
                                }
                                case 6: day = 6;    {
                                    sw.setFreeWorkday(Workdays.SATURDAY);
                                }
                                case 7: day = 7;    {
                                    sw.setFreeWorkday(Workdays.SUNDAY);
                                }
                            }
                            System.out.println("Enter University: ");
                            sw.setUniversity(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Course: ");
                            sw.setCourse(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Workplace: ");
                            sw.setWorkplace(scanner.next());
                            scanner.reset();
                            System.out.println("Enter Salary: ");
                            sw.setSalary(scanner.nextInt());
                            scanner.reset();
                            person[count] = sw;
                            count++;
                        } else {
                            System.out.println("Invalid Entry");
                        }
                    }

                }
                case 2: choice = 2; {
                    for(int i = 0; i < person.length; i++)  {
                        System.out.println(person[i]);
                    }
                }
                case 3: choice = 3; {
                    for(int i = 0; i < person.length; i++)  {

                    }
                }
            }
        }
    }
}
