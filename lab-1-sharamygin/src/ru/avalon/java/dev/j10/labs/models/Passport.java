package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
 
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    String serialNo;
    String name;
    String lastName;
    String genName;
    String secName;
    String dateOfBirth;
    String dateOfIssue;
    String org;
 
    //#1 Нет отчества и второго имени
    public Passport(String serialNo, String name, String lastName, 
             String dateOfBirth, String dateOfIssue, String org){
        this.serialNo = serialNo;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.org = org;
    }
    //#2 нет отчества
        public Passport(String serialNo, String name, String lastName, 
            String secName, String dateOfBirth, String dateOfIssue, String org){
        this(serialNo, name, lastName, dateOfBirth, dateOfIssue, org);
        this.secName = secName;
    }
    //#3 оставшийся вариант
        public Passport(String serialNo, String name, String lastName, 
            String secName, String genName, String dateOfBirth, String dateOfIssue, String org){
        this(serialNo, name, lastName, secName, dateOfBirth, dateOfIssue, org);
        this.genName = genName;
    } 
        public String getSerialNo(){
        return serialNo;}
    
        public String getnName(){
        return name;}
    
        public String lastName(){
        return lastName;}
    
        public String genName(){
        return genName;}
    
        public String secName(){
        return secName;}

        public String dateOfBirth(){
        return dateOfBirth;}
        
        public String dateOfIssue(){
        return dateOfIssue;}
        
        public String org(){
        return org;}
}
