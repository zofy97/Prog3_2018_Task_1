package Task_1;

public interface Person {

    public String getFirstname();
    public String getLastname();
    public int getAge();
    public Workdays getFreeWorkday();

    public void setFirstname(String firstname);
    public void setLastname(String lastname);
    public void setAge(int age);
    public void setFreeWorkday(Workdays freeWorkday);
}
