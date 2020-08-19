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

public class Car {
    String carClass;
    String marka;
    int weight;
    Engine engine;
    Driver driver;

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarClass() {
        return this.carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public void printInfo() {
        System.out.println("Автомобиль " + this.marka +
                ". Класс автомобиля - " + this.carClass + ", двигатель - " + this.engine.getCompany() +
                " мощностью " + this.engine.getPower() + " л.с. Вес автомобиля - " + this.weight +
                ". Водитель автомобиля - " + this.driver.getFullName() + ", возраст - " + this.driver.getAge() +
                "лет, опыт вождения - " + this.driver.getExperience() + " лет");
    }

    public Car(String carClass, String marka, int weight, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.marka = marka;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public Car() {
        this.carClass = "";
        this.marka = "";
        this.weight = 0;
        this.engine = new Engine();
        this.driver = new Driver();
    }
}
