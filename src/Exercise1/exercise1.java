package Exercise1;

public class exercise1 {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("89534527835", "Honor 10", 500);
        phones[1] = new Phone("89534527830", "iPhone 11", 800);
        phones[2] = new Phone("89226272677", "iPhone 7+", 730.5);
        String number1 = phones[0].getNumber();
        String number2 = phones[1].getNumber();
        String number3 = phones[2].getNumber();
        System.out.print(number1 + " : ");
        phones[0].receiveCall("Aleksandr");
        System.out.print(number2 + " : ");
        phones[1].receiveCall("Masha");
        System.out.print(number3 + " : ");
        phones[2].receiveCall("Anton");
        new Phone("88005553535", "Nokia 3310").receiveCall("Vasily", "83532444787");
        new Phone().sendMessage("89534527835", "88005535355", "83532444787", "89228187887");
    }
}

class Phone {
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
