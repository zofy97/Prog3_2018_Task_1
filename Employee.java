package Task_1;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Employee implements Person {

    String firstname;
    String lastname;
    int age;
    Workdays freeWorkday ;
    String workplace;
    int salary;

    Employee (String first, String last, int age, Workdays free, String place, int salary)  {
        firstname = first;
        lastname = last;
        this.age = age;
        freeWorkday = free;
        workplace = place;
        this.salary = salary;
    }

    Employee () {

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Workdays getFreeWorkday() {
        return freeWorkday;
    }

    public String getWorkplace() {
        return workplace;
    }

    public int getSalary() {
        return salary;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFreeWorkday(Workdays freeWorkday) {
        this.freeWorkday = freeWorkday;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", freeWorkday=" + freeWorkday +
                ", workplace='" + workplace + '\'' +
                ", salary=" + salary +
                '}';
    }
}
