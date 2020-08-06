package exercise1;

public class Exercise1 {
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