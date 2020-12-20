package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, LocalDate birthdate) {
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

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthdate, today).getYears();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
