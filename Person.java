/**
 * @Sophie Schauer s0559289
 */
/*
interface which is implemented in Student and Employee
 */
public interface Person {

    String getFirstname();
    String getLastname();
    int getAge();
    Workdays getFreeWorkday();

    void setFirstname(String firstname);
    void setLastname(String lastname);
    void setAge(int age);
    void setFreeWorkday(Workdays freeWorkday);
}
