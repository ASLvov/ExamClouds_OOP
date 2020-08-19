package exercise7;

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
import exercise7.vehicles.Car;
import exercise7.vehicles.Lorry;
import exercise7.vehicles.SportCar;

public class Exercise7 {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Львов Александр Сергеевич", 25, 7);
        Driver driver2 = new Driver("Christopher Robin", 65, 44);
        Engine engine1 = new Engine("General Motors", 150);
        Engine engine2 = new Engine("Lada", 86);
        Car car1 = new Car("Бизнес", "Lexus", 1500, engine1, driver1);
        Car car2 = new Car("Эконом", "ВАЗ", 890, engine2, driver2);
        car1.printInfo();
        car2.printInfo();
        car2.setDriver(new Driver("Владимир Ильич Ленин", 99, 9));
        car1.setEngine(new Engine("Toyota Motors", 250));
        car1.printInfo();
        car2.printInfo();
        car1 = new SportCar("Бизнес", "Lexus", 1500, new Engine("Toyota Motors", 250), driver1, 250);
        car1.printInfo();
        car2 = new Lorry("Эконом", "ВАЗ", 890, engine2, new Driver("Владимир Ильич Ленин", 99, 9), 2500);
        car2.printInfo();
    }
}
