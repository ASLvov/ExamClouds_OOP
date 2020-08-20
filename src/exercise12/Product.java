package exercise12;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
   Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
   Создать объект класса User. (Интернет магазин)
 */

public class Product {
    String name;
    int price;
    double rating;

    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
        this.name = "";
        this.price = 0;
        this.rating = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void printInfo() {
        System.out.println("Товар \"" + this.name + "\". Стоимость " + this.price +
                " руб. Рейтинг товара - " + this.rating);
    }
}
