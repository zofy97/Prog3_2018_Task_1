package Task_1;

public class Student implements Person {

    String firstname;
    String lastname;
    int age;
    Workdays freeWorkday;
    String university;
    String course;

    Student(String first, String last, int age, Workdays free, String uni, String course)   {
        firstname = first;
        lastname = last;
        this.age = age;
        freeWorkday = free;
        university = uni;
        this.course = course;
    }

    Student()   {

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

    public String getCourse() {
        return course;
    }

    public String getUniversity() {
        return university;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFreeWorkday(Workdays freeWorkday) {
        this.freeWorkday = freeWorkday;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", course='" + course + '\'' +
                ", freeWorkday=" + freeWorkday +
                '}';
    }
}
