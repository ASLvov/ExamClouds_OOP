package exercise7.vehicles;

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

import exercise7.details.Engine;
import exercise7.professions.Driver;

public class SportCar extends Car {
    double speedLimit;

    public double getSpeedLimit() {
        return this.speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public void printInfo() {
        System.out.println("Автомобиль " + this.marka +
                ". Класс автомобиля - " + this.carClass + ", двигатель - " + this.engine.getCompany() +
                " мощностью " + this.engine.getPower() + " л.с. Вес автомобиля - " + this.weight +
                ". Максимальная скорость - " + this.speedLimit + " км/ч" +
                ". Водитель автомобиля - " + this.driver.getFullName() + ", возраст - " + this.driver.getAge() +
                "лет, опыт вождения - " + this.driver.getExperience() + " лет");
    }

    public SportCar(String carClass, String marka, int weight, Engine engine, Driver driver, double speedLimit) {
        super(carClass, marka, weight, engine, driver);
        this.speedLimit = speedLimit;
    }

    public SportCar() {
        super();
        this.speedLimit = 0;
    }
}
