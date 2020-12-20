package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person("Blas", "Cabrera", date);
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge() + " años");
    }
    
}
