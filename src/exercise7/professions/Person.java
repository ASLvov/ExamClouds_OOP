package exercise7.professions;

/*
Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и
Driver в пакете com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес,
водитель типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
Пусть класс Driver расширяет класс Person.
 */

public class Person {
    int age;
    String fullName;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "";
        this.age = 0;
    }
}
