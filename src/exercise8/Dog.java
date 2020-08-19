package exercise8;

/*
    Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
    Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
    Dog, Cat, Horse переопределяют методы makeNoise, eat.
    Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
    Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
    Пусть этот метод распечатывает food и location пришедшего на прием животного.
    В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
    В цикле отправляйте их на прием к ветеринару.
*/

public class Dog extends Animal {
    String voice = "гав";

    public void makeNoise() {
        System.out.println("Собака говорит " + this.voice);
    }

    public void eat() {
        System.out.println("Собака ест" + this.food);
    }

    public void sleep() {
        System.out.println("Собака спит");
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog() {
        super();
    }
}