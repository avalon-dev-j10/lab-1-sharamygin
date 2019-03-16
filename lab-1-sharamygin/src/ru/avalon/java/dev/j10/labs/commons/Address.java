/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

package ru.avalon.java.dev.j10.labs.commons;


public class Address {
 String region;
 String city;
 String street;
 String houseNo;
 String roomNo;
 
 
 
 public Address(String region, String city, String street, String houseNo, 
 String roomNo) {
     this.region = region;
     this.city = city;
     this.street = street;
     this.houseNo = houseNo;
     this.roomNo = roomNo;
 }
public String getAddress(){
    String address = region + ", " + city + ", " + street + " " + houseNo + ", кв. " + roomNo;
     return address;
 }
//строки 35-39 мне проще описать в качестве переменных в классе Person, чем
// там объявлять все нижеперечисленные переменные.
 /*
 public String getRegion(){
     return region;}

 public String getCity(){
     return city;}
 
 public String getStreet(){
     return street;}
 
 public int getHouseNo(){
     return houseNo;}
 
 public int getRoomNo(){
     return roomNo;}
  */
}



