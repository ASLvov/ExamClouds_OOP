package exercise1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) { //Конструктор с тремя параметрами
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) { //Конструктор с двумя параметрами
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() { //Конструктор без параметров
        number = "";
        model = "";
        weight = 0;
    }

    public void receiveCall(String name) {  //Выводит в консоль сообщение "Звонит {имя}"
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String num) { //Перегруженный метод с двумя параметрами
        System.out.println("Звонит " + name + ". " + num);
    }

    public String getNumber() { //Возвращает номер телефона
        return this.number;
    }

    public void setNumber(String number) { //Устанавливает номер телефона
        this.number = number;
    }

    public String getModel() { //Возвращает модель телефона
        return this.model;
    }

    public void setModel(String model) { //Устанавливает модель телефона
        this.model = model;
    }
    public double getWeight() { //Возвращает вес телефона
        return this.weight;
    }

    public void setWeight(double weight) { //Устанавливает вес телефона
        this.weight = weight;
    }

    public void sendMessage(String... numbers) { //Выводит в консоль номера телефонов, полученных в качестве параметров
        for (String num : numbers)
            System.out.println(num);
    }
}
