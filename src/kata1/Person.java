package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final String surname;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Calendar birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    
}
