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
   public String serialNo;
   public String name;
   public String lastName;
   public String genName;
   public String secName;
   public String dateOfBirth;
   public String dateOfIssue;
   public String org;
   public String fullName;
 
    //#1 Нет отчества и второго имени
    public Passport(String name, String lastName){
        this.name = name;
        this.lastName = lastName;

    }
    //#2 нет отчества
        public Passport(String name, String lastName, String genName){
        this(name, lastName);
        this.genName = genName;
    }
    //#3 оставшийся вариант
        public Passport(String name, String lastName, String genName, String secName){
        this( name, lastName, genName);
        this.secName = secName;
    } 
        
     
        public String getSerialNo(){
        return serialNo;}
    
        public String getName(){
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
        
        
        public String getFullName(){
              
         /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if ((secName == null) && (genName == null)){
            fullName = name + " " + lastName;
        }
        else if ((genName == null) && (secName != null)){
            fullName = name + " " + secName.substring(0,1) + ". " + lastName;  
        }
        else {
        fullName = name + " " + lastName + " " + genName;
    }
            return fullName;
    }
        
}
