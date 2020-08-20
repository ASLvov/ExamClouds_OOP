package exercise12;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
   Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
   Создать объект класса User. (Интернет магазин)
 */

public class Basket {
    Product[] products;

    public Basket(Product[] products) {
        this.products = products.clone();
    }

    public Basket() {
        this.products = new Product[0];
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
