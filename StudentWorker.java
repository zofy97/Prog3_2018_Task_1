package Task_1;

public class StudentWorker extends Student {

    String workplace;
    int salary;

    StudentWorker(String first, String last, int age, Workdays freeWorkday, String uni, String course, String workplace, int salary)  {
        super(first, last, age, freeWorkday, uni, course);
        this.workplace = workplace;
        this.salary = salary;
    }

    StudentWorker  ()   {

    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "StudentWorker{" +
                "workplace='" + workplace + '\'' +
                ", salary=" + salary +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", freeWorkday=" + freeWorkday +
                ", university='" + university + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
