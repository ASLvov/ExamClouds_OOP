package exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Aleksandr Lvov", 25);
        person1.setFullName("Masha Lvova");
        person1.setAge(25);
        person1.talk("Сходи в магазин!");
        person2.move();
    }
}
