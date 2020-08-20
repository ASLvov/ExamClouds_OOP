package exercise12;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
   Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
   Создать объект класса User. (Интернет магазин)
 */

public class Category {
    String name;
    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products.clone();
    }

    public Category() {
        this.name = "";
        this.products = new Product[0];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products.clone();
    }
}
