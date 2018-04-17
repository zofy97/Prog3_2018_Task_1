public enum Workdays {

    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private final String day;

    Workdays(String workday)    {
        day = workday;
    }

    public String toString()    {
        return day;
    }
}
