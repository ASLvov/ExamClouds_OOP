package exercise7.details;

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

public class Engine {
    int power;
    String company;

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public Engine() {
        this.company = "";
        this.power = 0;
    }
}
