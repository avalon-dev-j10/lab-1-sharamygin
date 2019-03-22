package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person("Иван");
        Person smith = new Person("John");
       
        Passport ivanovPassport = new Passport(ivanov.getName(), "Иванов", "Иванович");
        Passport smithPassport = new Passport(smith.getName(), "Smith", null, "Edvard");
        
        
        ivanov.setAddress(new Address("Лен. обл.", "СПб", "Энгельса", "154", "3"));
        smith.setAddress(new Address("England", "Wales", "Some street", "1223", "2"));
        
        ivanov.setPassport(ivanovPassport);
        smith.setPassport(smithPassport);

               
        System.out.println(ivanov.getFullName());
        System.out.println(smith.getFullName());
        System.out.println(ivanov.getAddress());
        System.out.println(smith.getAddress());



        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
