package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Blas", "Cabrera", new Date(49, 8, 24));
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge());
    }
    
}
